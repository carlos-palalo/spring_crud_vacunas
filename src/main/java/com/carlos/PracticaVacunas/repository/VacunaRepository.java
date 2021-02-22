package com.carlos.PracticaVacunas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.carlos.PracticaVacunas.model.Vacuna;
import java.util.List;

import javax.transaction.Transactional;

@Repository
public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {

	public List<Vacuna> findByComunidad(String comunidad);
}
