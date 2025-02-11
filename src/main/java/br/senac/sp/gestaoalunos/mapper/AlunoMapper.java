package br.senac.sp.gestaoalunos.mapper;

import br.senac.sp.gestaoalunos.entities.AlunoEntity;
import br.senac.sp.gestaoalunos.model.AlunoModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoMapper {

    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);

    AlunoEntity toEntity(AlunoModel model);

    AlunoModel toModel(AlunoEntity entity);

}