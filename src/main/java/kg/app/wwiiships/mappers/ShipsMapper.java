package kg.app.wwiiships.mappers;

import kg.app.wwiiships.models.DTOs.ShipsDTO;
import kg.app.wwiiships.models.Ships;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ShipsMapper {
    ShipsMapper INSTANCE = Mappers.getMapper(ShipsMapper.class);
//    @Mapping(source = "classes.name", target = "className")

    ShipsDTO toDTO(Ships Ships);
    Ships toEntity(ShipsDTO ShipsDTO);
    List<ShipsDTO> toDTOList(List<Ships>ShipsList);
    List<Ships>toEntityList(List<ShipsDTO>ShipsDTOList);
}
