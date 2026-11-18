package br.com.moises.spring_boot_jpa.database.repository;

import br.com.moises.spring_boot_jpa.database.model.TreinosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinosRepository extends JpaRepository<TreinosEntity, Integer> {

}
