package com.debappte.entidad;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@XmlRootElement
public class Usuario implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String correoElectronico;
	private String contrasena;
	
	
	private static final long serialVersionUID = 1L;
	
	public Usuario(String nombre, String primerApellido, String segundoApellido, 
			String correo, String contrasena){
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.correoElectronico = correo;
		this.contrasena = contrasena;
	}

	public Usuario() {
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

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
   
}
