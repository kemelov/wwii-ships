package kg.app.wwiiships.services.impl;

import kg.app.wwiiships.mappers.OutcomesMapper;
import kg.app.wwiiships.mappers.ShipsMapper;
import kg.app.wwiiships.models.DTOs.OutcomesDTO;
import kg.app.wwiiships.models.DTOs.ShipsDTO;
import kg.app.wwiiships.models.Outcomes;
import kg.app.wwiiships.models.Ships;
import kg.app.wwiiships.repositories.ShipsRepo;
import kg.app.wwiiships.services.ShipsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ShipsServiceImpl implements ShipsService {
    private final ShipsMapper shipsMapper;
    private final OutcomesMapper outcomesMapper;
    private final ShipsRepo shipsRepo;


    @Override
    public List<String> collectShipsFromOutcomes(List<OutcomesDTO> outcomeDTOS) {

        List<String> shipsFromOutcomes = outcomesMapper.toEntityList(outcomeDTOS)
                .stream()
                .map(Outcomes::getShip)
                .collect(Collectors.toList());

        return shipsFromOutcomes;
    }

    @Override
    public ShipsDTO findByName(String name) {
        Ships ship = shipsRepo.findByName(name)
                .orElseThrow(() -> new NoSuchElementException("Ship not found"));
        return shipsMapper.toDTO(ship);
    }

    @Override
    public List<ShipsDTO> getAll() {
        List<Ships> ships = shipsRepo.findAll();
        return shipsMapper.toDTOList(ships);
    }
}
