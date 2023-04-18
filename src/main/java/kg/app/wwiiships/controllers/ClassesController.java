package kg.app.wwiiships.controllers;

import kg.app.wwiiships.models.DTOs.ClassesDTO;
import kg.app.wwiiships.models.Result;
import kg.app.wwiiships.services.ClassesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/classes")
public class ClassesController {
    private final ClassesService classesService;

    public ClassesController(ClassesService classesService) {
        this.classesService = classesService;
    }

    @GetMapping("/findByResult")
    public Set<ClassesDTO> findByResult(@RequestParam(name = "battle_result") Result battleResult) {
        return classesService.findByResult(battleResult);
    }

    @GetMapping("/findByName")
    public ClassesDTO findByName(@RequestParam(name = "class_name") String name) {
        return classesService.findByName(name);
    }
}
