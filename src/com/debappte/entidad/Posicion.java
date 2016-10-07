package com.debappte.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Posicion
 *
 */
@Entity

public class Posicion implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String nombre;
	@ManyToOne
	private Debate debate;
	
	
	private static final long serialVersionUID = 1L;

	public Posicion() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Debate getDebate() {
		return debate;
	}

	public void setDebate(Debate debate) {
		this.debate = debate;
	}
   
}
