package br.senac.sp.gestaoalunos.service;

import br.senac.sp.gestaoalunos.entities.AlunoEntity;
import br.senac.sp.gestaoalunos.mapper.AlunoMapper;
import br.senac.sp.gestaoalunos.model.AlunoModel;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import br.senac.sp.gestaoalunos.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Comparator;

@Service
public class AlunoServiceImpl implements AlunoService {

    private AlunoRepository repository;

    public AlunoServiceImpl(AlunoRepository repository) {
        this.repository = repository;
    }

    @Override
    public AlunoModel salvar(AlunoModel aluno) {
        var alunoEntity = AlunoMapper.INSTANCE.toEntity(aluno);
        alunoEntity.setMatricula(this.getEpocaAtual());
        return AlunoMapper.INSTANCE.toModel(repository.save(alunoEntity));
    }

    @Override
    public void deletar(AlunoModel aluno) {
        var alunoEntity = AlunoMapper.INSTANCE.toEntity(aluno);
        repository.delete(alunoEntity);
    }

    @Override
    public Page<AlunoModel> listar(final Pageable pageable) {
        var alunos = repository.findAll(pageable);
        var alunosModel = alunos.stream()
                .sorted(Comparator.comparing(AlunoEntity::getNome))
                .map(aluno -> new AlunoModel(
                        aluno.getId(),
                        aluno.getNome(),
                        aluno.getMatricula(),
                        aluno.getDataIngresso(),
                        aluno.getDataNascimento(),
                        aluno.getEmail(),
                        aluno.getTelefone()
                )).toList();
        return new PageImpl<>(alunosModel, pageable, alunos.getTotalElements());
    }

    @Override
    public AlunoModel buscar(AlunoModel aluno) {
        var alunoEntity = repository.findById(aluno.getId());
        return alunoEntity.map(AlunoMapper.INSTANCE::toModel).orElse(null);
    }

    @Override
    public long getEpocaAtual() {
        return Instant.now().getEpochSecond();
    }

}