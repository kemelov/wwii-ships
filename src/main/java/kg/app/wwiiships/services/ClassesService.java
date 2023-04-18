package kg.app.wwiiships.services;

import kg.app.wwiiships.models.DTOs.ClassesDTO;
import kg.app.wwiiships.models.Result;

import java.util.List;
import java.util.Set;

public interface ClassesService {
    Set<ClassesDTO> findByResult(Result battleResult);
    ClassesDTO findByName(String name);
    List<ClassesDTO> findALL();
}
