package com.carlos.PracticaVacunas.controller;

import com.carlos.PracticaVacunas.model.Vacuna;
import com.carlos.PracticaVacunas.service.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/vacunas")
public class VacunaController {
	@Autowired
	VacunaService vacunaService;

	@GetMapping("")
	public List<Vacuna> list() {
		return vacunaService.listAllVacuna();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Vacuna> get(@PathVariable Integer id) {
		try {
			Vacuna vacuna = vacunaService.getVacuna(id);
			return new ResponseEntity<Vacuna>(vacuna, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Vacuna>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/insertar")
	public void add(@RequestBody Vacuna vacuna) {
		vacunaService.saveVacuna(vacuna);
	}

	@PutMapping("/modificar/{id}")
	public ResponseEntity<?> update(@RequestBody Vacuna vacuna, @PathVariable Integer id) {
		try {
			Vacuna existVacuna = vacunaService.getVacuna(id);
			vacuna.setId(id);
			vacunaService.saveVacuna(vacuna);
			return new ResponseEntity<Vacuna>(vacuna, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Vacuna>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/borrar/{id}")
	public void delete(@PathVariable Integer id) {
		vacunaService.deleteVacuna(id);
	}

	@GetMapping("/porcomunidad/{comunidad}")
	public List<Vacuna> getComunidad(@PathVariable String comunidad) {
		return vacunaService.getComunidad(comunidad);

	}
}
