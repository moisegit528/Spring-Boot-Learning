package br.com.moises.spring_boot_jpa.database.repository;

import br.com.moises.spring_boot_jpa.database.model.AlunosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<AlunosEntity, Integer> {
}
