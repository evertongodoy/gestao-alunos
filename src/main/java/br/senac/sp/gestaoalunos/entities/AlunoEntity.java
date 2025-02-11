package br.senac.sp.gestaoalunos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "aluno")
public class AlunoEntity {

    @Id
    @Column(length = 36) // Definir ID com 36 caracteres
    private String id;
    @Column(length = 50, nullable = false) // Nome com 50 caracteres
    private String nome;
    @Column(nullable = false, unique = true) // Matrícula única e obrigatória
    private Long matricula;
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Formato que o HTML <input type="date"> espera
    @Column(name = "data_ingresso", nullable = false) // Data de ingresso obrigatória
    private LocalDate dataIngresso;
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Formato que o HTML <input type="date"> espera
    @Column(name = "data_nascimento", nullable = false) // Data de nascimento obrigatória
    private LocalDate dataNascimento;
    @Column(length = 100, nullable = false) // Email com 100 caracteres e obrigatório
    private String email;
    @Column(length = 100, nullable = false) // Telefone com 100 caracteres
    private String telefone;

    public AlunoEntity() {
    }

    public AlunoEntity(String id, String nome, Long matricula, LocalDate dataIngresso, LocalDate dataNascimento, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    @PrePersist
    public void prePersist() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString();
        }
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

}