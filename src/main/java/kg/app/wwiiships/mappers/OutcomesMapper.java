package kg.app.wwiiships.mappers;

import kg.app.wwiiships.models.DTOs.OutcomesDTO;
import kg.app.wwiiships.models.Outcomes;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OutcomesMapper {
    OutcomesMapper INSTANCE = Mappers.getMapper(OutcomesMapper.class);
    OutcomesDTO toDTO(Outcomes Outcomes);
    Outcomes toEntity(OutcomesDTO OutcomesDTO);
    List<OutcomesDTO> toDTOList(List<Outcomes>OutcomesList);
    List<Outcomes>toEntityList(List<OutcomesDTO>OutcomesDTOList);
}
