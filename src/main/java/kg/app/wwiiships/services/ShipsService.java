package kg.app.wwiiships.services;

import kg.app.wwiiships.models.DTOs.OutcomesDTO;
import kg.app.wwiiships.models.DTOs.ShipsDTO;

import java.util.List;

public interface ShipsService {
    List<String> collectShipsFromOutcomes(List<OutcomesDTO> outcomes);
    ShipsDTO findByName(String name);
    List<ShipsDTO> getAll();
}
