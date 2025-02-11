package br.senac.sp.gestaoalunos.repository;

import br.senac.sp.gestaoalunos.entities.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, String> {

}