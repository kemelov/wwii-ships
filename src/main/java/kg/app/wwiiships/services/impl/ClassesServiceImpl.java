package kg.app.wwiiships.services.impl;

import kg.app.wwiiships.mappers.ClassesMapper;
import kg.app.wwiiships.models.Classes;
import kg.app.wwiiships.models.DTOs.ClassesDTO;
import kg.app.wwiiships.models.DTOs.ShipsDTO;
import kg.app.wwiiships.models.Result;
import kg.app.wwiiships.repositories.ClassesRepo;
import kg.app.wwiiships.services.ClassesService;
import kg.app.wwiiships.services.OutcomesService;
import kg.app.wwiiships.services.ShipsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class ClassesServiceImpl implements ClassesService {
    private final ClassesRepo classesRepo;
    private final ClassesMapper classesMapper;
    private final OutcomesService outcomesService;
    private final ShipsService shipsService;


    // Метод для поиска классов кораблей, участвовавших в сражении с заданным результатом
    @Override
    public Set<ClassesDTO> findByResult(Result battleResult) {
        // Создание множества для хранения найденных классов кораблей
        Set<ClassesDTO> foundClasses = new HashSet<>();
        // Получение списка названий кораблей, участвовавших в сражении с заданным результатом
        List<String> shipsFromOutcomes = new ArrayList<>(shipsService.collectShipsFromOutcomes(outcomesService.findByResult(battleResult)));



        // Поиск всех кораблей в таблице "Ships"
        for (ShipsDTO shipsDTO : shipsService.getAll()) {
            // Если корабль участвовал в сражении, находим класс этого корабля, добавляем его в множество "foundClasses"
            if (shipsFromOutcomes.contains(shipsDTO.getName())) {
                foundClasses.add(findByName(shipsDTO.getClassName()));
            }

            // Поиск всех классов кораблей в таблице "Classes"
            for (ClassesDTO classDTO : findALL()) {
                // Если класс корабля участвовал в сражении, добавляем его в множество "foundClasses"
                if (shipsFromOutcomes.contains(classDTO.getName())) {
                    foundClasses.add(classDTO);
                }
            }
        }
        // Возвращаем найденные классы кораблей, участвовавших в сражении
        return foundClasses;
    }

    // Метод для поиска класса корабля по названию
    @Override
    public ClassesDTO findByName(String name) {
        // Поиск класса корабля в таблице "Classes" по названию
        Classes classes = classesRepo.findByName(name)
                .orElseThrow(() -> new NoSuchElementException("Корабль не найден"));
        // Преобразование найденного класса в объект DTO
        return classesMapper.toDTO(classes);
    }

    // Метод для поиска всех классов кораблей в таблице "Classes"
    @Override
    public List<ClassesDTO> findALL() {
        // Поиск всех классов кораблей в таблице "Classes"
        List<Classes> AllClasses = classesRepo.findAll();
        // Преобразование найденных классов в список объектов DTO
        return classesMapper.toDTOList(AllClasses);
    }
}
