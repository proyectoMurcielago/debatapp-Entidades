package com.debappte.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pregunta
 *
 */
@Entity

public class Pregunta implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String enunciado;
	private boolean aprovado;
	@ManyToOne
	private Usuario autor;
	//
	
	private static final long serialVersionUID = 1L;

	public Pregunta() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
   
}
