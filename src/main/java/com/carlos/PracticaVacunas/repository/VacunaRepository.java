package com.carlos.PracticaVacunas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.PracticaVacunas.model.Vacuna;
import java.util.List;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {

	public List<Vacuna> findByComunidad(String comunidad);
}
