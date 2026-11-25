package br.com.moises.spring_boot_jpa.controller;

import br.com.moises.spring_boot_jpa.database.model.ExerciciosEntity;
import br.com.moises.spring_boot_jpa.dto.ExerciciosDto;
import br.com.moises.spring_boot_jpa.service.ExerciciosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exercicios")
@RequiredArgsConstructor
public class ExerciciosController {

    private final ExerciciosService exerciciosService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findAll(){
        return exerciciosService.findAll();
    }

    @GetMapping("/grupos/{grupoMuscular}")
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findAllByGrupoMuscular(@PathVariable String grupoMuscular){
        return exerciciosService.findByGrupoMuscular(grupoMuscular);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveExercicio(@RequestBody ExerciciosDto exercicioDto){
        exerciciosService.save(exercicioDto);
    }
}
