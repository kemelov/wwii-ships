package kg.app.wwiiships.services.impl;

import kg.app.wwiiships.mappers.OutcomesMapper;
import kg.app.wwiiships.models.DTOs.OutcomesDTO;
import kg.app.wwiiships.models.Outcomes;
import kg.app.wwiiships.models.Result;
import kg.app.wwiiships.repositories.OutcomesRepo;
import kg.app.wwiiships.services.OutcomesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OutcomesServiceImpl implements OutcomesService {
    private final OutcomesRepo outcomesRepo;
    private final OutcomesMapper outcomesMapper;

    public OutcomesServiceImpl(OutcomesRepo outcomesRepo, OutcomesMapper outcomesMapper) {
        this.outcomesRepo = outcomesRepo;
        this.outcomesMapper = outcomesMapper;
    }

    @Override
    public List<OutcomesDTO> findByResult(Result result) {
        List<Outcomes> outcomes = outcomesRepo.findByResult(result);
        return outcomesMapper.toDTOList(outcomes);
    }

    @Override
    public OutcomesDTO findById(Long id) {
        Optional<Outcomes> optionalOutcomes = outcomesRepo.findById(id);
        if (optionalOutcomes.isEmpty()){
            throw new RuntimeException("error no such outcome");
        }
        return outcomesMapper.toDTO(optionalOutcomes.get());
    }
}
