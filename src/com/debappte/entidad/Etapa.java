package com.debappte.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etapa
 *
 */
@Entity
public class Etapa implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String nombre;
	private int duracionMinima,duracionMaxima;
	private int reiteraciones;
	
	private static final long serialVersionUID = 1L;

	public Etapa() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracionMinima() {
		return duracionMinima;
	}

	public void setDuracionMinima(int duracionMinima) {
		this.duracionMinima = duracionMinima;
	}

	public int getDuracionMaxima() {
		return duracionMaxima;
	}

	public void setDuracionMaxima(int duracionMaxima) {
		this.duracionMaxima = duracionMaxima;
	}

	public int getReiteraciones() {
		return reiteraciones;
	}

	public void setReiteraciones(int reiteraciones) {
		this.reiteraciones = reiteraciones;
	}
   
}
