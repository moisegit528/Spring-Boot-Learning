package br.com.moises.spring_boot_jpa.database.repository;

import br.com.moises.spring_boot_jpa.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciciosRepository extends JpaRepository<ExerciciosEntity, Integer> {

    List<ExerciciosEntity> findByGrupoMuscular(String grupoMuscular);
}
