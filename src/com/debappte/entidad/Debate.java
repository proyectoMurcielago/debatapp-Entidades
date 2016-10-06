package com.debappte.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Debate
 *
 */
@Entity

public class Debate implements Serializable {

	@Id @GeneratedValue
	private long id;
	private String nombre;
	private Date fechaInicial;
	@ManyToOne	
	private Modelo modelo;
	@OneToMany(cascade= CascadeType.ALL)
	private ArrayList<Posicion> posiciones;
	@OneToMany(cascade=CascadeType.ALL)
	private ArrayList<Pregunta> preguntas;
	
	
	private static final long serialVersionUID = 1L;

	public Debate() {
		super();
	}

	public ArrayList<Posicion> getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(ArrayList<Posicion> posiciones) {
		this.posiciones = posiciones;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
   
}
