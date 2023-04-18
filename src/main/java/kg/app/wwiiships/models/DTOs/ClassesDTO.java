package kg.app.wwiiships.models.DTOs;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kg.app.wwiiships.models.Country;
import lombok.Data;

@Data
public class ClassesDTO {
    private String name;
    private String type;
    @Enumerated(EnumType.STRING)
    private Country country;
    private short numGuns;
    private double bore;
    private int displacement;
}
