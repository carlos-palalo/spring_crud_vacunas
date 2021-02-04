package com.carlos.PracticaVacunas.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "vacunas")
public class Vacuna {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String comunidad;
	private int pzifer;
	private int moderna;
	private int dosis_Administradas;
	private int pauta_Completa;
	private Date fecha_Ult_Vacuna;

	public Vacuna() {

	}

	public Vacuna(int id, String comunidad, int pzifer, int moderna, int dosis_Administradas, int pauta_Completa,
			Date fecha_Ult_Vacuna) {
		super();
		this.id = id;
		this.comunidad = comunidad;
		this.pzifer = pzifer;
		this.moderna = moderna;
		this.dosis_Administradas = dosis_Administradas;
		this.pauta_Completa = pauta_Completa;
		this.fecha_Ult_Vacuna = fecha_Ult_Vacuna;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	public int getPzifer() {
		return pzifer;
	}

	public void setPzifer(int pzifer) {
		this.pzifer = pzifer;
	}

	public int getModerna() {
		return moderna;
	}

	public void setModerna(int moderna) {
		this.moderna = moderna;
	}

	public int getdosis_Administradas() {
		return dosis_Administradas;
	}

	public void setdosis_Administradas(int dosis_Administradas) {
		this.dosis_Administradas = dosis_Administradas;
	}

	public int getpauta_Completa() {
		return pauta_Completa;
	}

	public void setpauta_Completa(int pauta_Completa) {
		this.pauta_Completa = pauta_Completa;
	}

	public Date getfecha_Ult_Vacuna() {
		return fecha_Ult_Vacuna;
	}

	public void setfecha_Ult_Vacuna(Date fecha_Ult_Vacuna) {
		this.fecha_Ult_Vacuna = fecha_Ult_Vacuna;
	}

}
