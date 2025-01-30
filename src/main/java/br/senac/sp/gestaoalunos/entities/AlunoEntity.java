package br.senac.sp.gestaoalunos.entities;

import java.time.LocalDate;

public class AlunoEntity {

    private String id;
    private String nome;
    private Long matricula;
    private LocalDate dataIngresso;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String observacoes;

    public AlunoEntity() {}

    public AlunoEntity(String id, String nome, Long matricula, LocalDate dataIngresso, LocalDate dataNascimento, String email, String telefone, String observacoes) {
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

    public AlunoEntity setId(String id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AlunoEntity setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Long getMatricula() {
        return matricula;
    }

    public AlunoEntity setMatricula(Long matricula) {
        this.matricula = matricula;
        return this;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public AlunoEntity setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
        return this;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public AlunoEntity setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AlunoEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public AlunoEntity setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public AlunoEntity setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

}