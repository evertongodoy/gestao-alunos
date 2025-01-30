package br.senac.sp.gestaoalunos.service;

import br.senac.sp.gestaoalunos.model.AlunoModel;

public interface AlunoService {

    public void salvar(final AlunoModel aluno);
    public void deletar(final AlunoModel aluno);
    public void atualizar(final AlunoModel aluno);
    public void listar();
    public void buscar(final AlunoModel aluno);

}