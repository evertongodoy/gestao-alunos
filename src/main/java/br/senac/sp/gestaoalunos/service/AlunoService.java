package br.senac.sp.gestaoalunos.service;

import br.senac.sp.gestaoalunos.model.AlunoModel;

public interface AlunoService {

    void salvar(final AlunoModel aluno);
    void deletar(final AlunoModel aluno);
    void atualizar(final AlunoModel aluno);
    void listar();
    void buscar(final AlunoModel aluno);

}