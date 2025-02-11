package br.senac.sp.gestaoalunos.service;

import br.senac.sp.gestaoalunos.model.AlunoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AlunoService {

    AlunoModel salvar(final AlunoModel aluno);
    void deletar(final AlunoModel aluno);
    Page<AlunoModel> listar(final Pageable pageable);

    AlunoModel buscar(final AlunoModel aluno);
    long getEpocaAtual();


}