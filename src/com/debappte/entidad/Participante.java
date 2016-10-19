package com.debappte.entidad;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Participante
 *
 */
@Entity
@XmlRootElement
public abstract class Participante implements Serializable {
	@Id @GeneratedValue
	protected long id;
	@ManyToOne 
	protected Usuario usuarioParticipante;
	@ManyToOne @JoinColumn(name="fk_debate")
	protected Debate debateAsignado;
	@ManyToOne 
	protected Posicion posicionAsignada;
	protected int amonestaciones;
	
	
	private static final long serialVersionUID = 1L;
	
	public Participante() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getUsuarioParticipante() {
		return usuarioParticipante;
	}

	public void setUsuarioParticipante(Usuario usuarioParticipante) {
		this.usuarioParticipante = usuarioParticipante;
	}

	public Debate getDebateAsignado() {
		return debateAsignado;
	}

	public void setDebateAsignado(Debate debateAsignado) {
		this.debateAsignado = debateAsignado;
	}

	public Posicion getPosicionAsignada() {
		return posicionAsignada;
	}

	public void setPosicionAsignada(Posicion posicionAsignada) {
		this.posicionAsignada = posicionAsignada;
	}

	public int getAmonestaciones() {
		return amonestaciones;
	}

	public void setAmonestaciones(int amonestaciones) {
		this.amonestaciones = amonestaciones;
	}
   
}
