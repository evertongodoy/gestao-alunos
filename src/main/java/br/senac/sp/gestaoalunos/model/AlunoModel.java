package br.senac.sp.gestaoalunos.model;

import java.time.LocalDate;

public class AlunoModel {

    private String id;
    private String nome;
    private Long matricula;
    private LocalDate dataIngresso;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String observacoes;

    public AlunoModel() {}

    public AlunoModel(String id, String nome, Long matricula, LocalDate dataIngresso, LocalDate dataNascimento, String email, String telefone, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.observacoes = observacoes;
    }

    public String getId() {
        return id;
    }

    public AlunoModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AlunoModel setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Long getMatricula() {
        return matricula;
    }

    public AlunoModel setMatricula(Long matricula) {
        this.matricula = matricula;
        return this;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public AlunoModel setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
        return this;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public AlunoModel setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AlunoModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public AlunoModel setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public AlunoModel setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

}