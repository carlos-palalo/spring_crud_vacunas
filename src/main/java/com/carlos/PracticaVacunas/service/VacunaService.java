package com.carlos.PracticaVacunas.service;

import com.carlos.PracticaVacunas.model.Vacuna;
import com.carlos.PracticaVacunas.repository.VacunaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class VacunaService {
	@Autowired
	private VacunaRepository vacunaRepository;

	public List<Vacuna> listAllVacuna() {
		return vacunaRepository.findAll();
	}

	public void saveVacuna(Vacuna vacuna) {
		vacunaRepository.save(vacuna);
	}

	public Vacuna getVacuna(Integer id) {
		return vacunaRepository.findById(id).get();
	}

	public void deleteVacuna(Integer id) {
		vacunaRepository.deleteById(id);
	}

	public List<Vacuna> getComunidad(String comunidad) {
		return vacunaRepository.findByComunidad(comunidad);
	}
}
