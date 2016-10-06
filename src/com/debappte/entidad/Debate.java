package com.debappte.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	private List<Posicion> posiciones;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Pregunta> preguntas;
	@OneToMany(mappedBy="debateAsignado",targetEntity=Participante.class, cascade= CascadeType.ALL)
	private List<Participante> participantes;
	
	
	private static final long serialVersionUID = 1L;

	public Debate() {
		super();
	}

	public List<Posicion> getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(ArrayList<Posicion> posiciones) {
		this.posiciones = posiciones;
	}

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}
   
}
