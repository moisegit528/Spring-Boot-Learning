package br.com.moises.spring_boot_jpa.service;

import br.com.moises.spring_boot_jpa.database.model.ExerciciosEntity;
import br.com.moises.spring_boot_jpa.database.repository.ExerciciosRepository;
import br.com.moises.spring_boot_jpa.dto.ExerciciosDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciciosService {

    private final ExerciciosRepository exerciciosRepository;

    public List<ExerciciosEntity> findAll(){
        return exerciciosRepository.findAll();
    }

    public void save (ExerciciosDto exerciciosDto){
        ExerciciosEntity exercicio = ExerciciosEntity.builder()
                .nome(exerciciosDto.getNome())
                .grupoMuscular(exerciciosDto.getGrupoMuscular())
                .build();
        exerciciosRepository.save(exercicio);
    }

    public List<ExerciciosEntity>  findByGrupoMuscular(String grupoMuscular){
        return exerciciosRepository.findByGrupoMuscular(grupoMuscular);
    }
}
