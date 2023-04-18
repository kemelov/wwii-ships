package kg.app.wwiiships.models.DTOs;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kg.app.wwiiships.models.Result;
import lombok.Data;

@Data
public class OutcomesDTO {
    private Long id;
    private String ship;
    private String battle;
    @Enumerated(EnumType.STRING)
    private Result result;
}
