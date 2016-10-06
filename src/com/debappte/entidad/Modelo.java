package com.debappte.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Modelo
 *
 */
@Entity
public class Modelo implements Serializable {
	
	@Id @GeneratedValue
	private long id;
	private String nombre;
	@OneToMany(orphanRemoval= true)
	private List<Etapa> etapas;
	
	private static final long serialVersionUID = 1L;

	public Modelo() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Etapa> getEtapas() {
		return etapas;
	}

	public void setEtapas(List<Etapa> etapas) {
		this.etapas = etapas;
	}
	
	public void agregarEtapa(Etapa e){ this.etapas.add(e);}
   
}
