package kg.app.wwiiships.mappers;

import kg.app.wwiiships.models.Classes;
import kg.app.wwiiships.models.DTOs.ClassesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClassesMapper {
    ClassesMapper INSTANCE = Mappers.getMapper(ClassesMapper.class);
    ClassesDTO toDTO(Classes Classes);
    Classes toEntity(ClassesDTO ClassesDTO);
    List<ClassesDTO> toDTOList(List<Classes>ClassesList);
    List<Classes>toEntityList(List<ClassesDTO>ClassesDTOList);
}
