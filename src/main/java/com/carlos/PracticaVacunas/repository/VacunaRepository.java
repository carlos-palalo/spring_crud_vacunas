package com.carlos.PracticaVacunas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.PracticaVacunas.model.Vacuna;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {
}
