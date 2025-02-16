package br.senac.sp.gestaoalunos.repository;

import br.senac.sp.gestaoalunos.entities.AlunoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends MongoRepository<AlunoEntity, String> {

}