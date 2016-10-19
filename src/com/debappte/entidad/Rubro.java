package com.debappte.entidad;

import java.awt.geom.Area;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Rubro
 *
 */
@Entity
@XmlRootElement
public class Rubro implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String descripcion;
	private String rol; //revisar si el rol es necesario
	@ManyToOne
	private Profesor profesor;
	@OneToMany
	private List <AreasAEvaluar> areasAEvaluar;
	
	private static final long serialVersionUID = 1L;

	public Rubro() {
		super();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		descripcion = descripcion;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List <AreasAEvaluar> getAreasAEvaluar() {
		return areasAEvaluar;
	}

	public void setAreasAEvaluar(ArrayList <AreasAEvaluar> areasAEvaluar) {
		this.areasAEvaluar = areasAEvaluar;
	}
   
	public void agregarAreaAlRubro(AreasAEvaluar ae){this.areasAEvaluar.add(ae);}
}
