package com.debappte.entidad;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: AreasAEvaluar
 *
 */
@Entity
@XmlRootElement
public class AreasAEvaluar implements Serializable {

	   
	@Id @GeneratedValue
	private int id;
	private String descripcion;
	private double puntosTotal, puntosAsignados;
	private static final long serialVersionUID = 1L;
	//rubro

	public AreasAEvaluar() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPuntosTotal() {
		return puntosTotal;
	}
	public void setPuntosTotal(double puntosTotal) {
		this.puntosTotal = puntosTotal;
	}
	public double getPuntosAsignados() {
		return puntosAsignados;
	}
	public void setPuntosAsignados(double puntosAsignados) {
		this.puntosAsignados = puntosAsignados;
	}
   
}
