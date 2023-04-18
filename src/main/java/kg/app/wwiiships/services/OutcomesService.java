package kg.app.wwiiships.services;

import kg.app.wwiiships.models.DTOs.OutcomesDTO;
import kg.app.wwiiships.models.Result;

import java.util.List;

public interface OutcomesService {
    List<OutcomesDTO> findByResult(Result result);
    OutcomesDTO findById(Long id);
}
