package br.com.moises.spring_boot_jpa.database.repository;

import br.com.moises.spring_boot_jpa.database.model.AvaliacoesFisicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacoesFisicasRepository extends JpaRepository<AvaliacoesFisicasEntity, Integer> {

}
