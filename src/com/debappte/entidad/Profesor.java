package com.debappte.entidad;

import com.debappte.entidad.Usuario;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Profesor
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Profesor extends Usuario implements Serializable {
	@OneToMany
	private List<Rubro> rubros;
	
	private static final long serialVersionUID = 1L;
	
	
	public Profesor() {
		super();
	}


	public List<Rubro> getRubros() {
		return rubros;
	}


	public void setRubros(List<Rubro> rubros) {
		this.rubros = rubros;
	}
	
	public void agregarRubro(Rubro r){this.rubros.add(r);}
   
}
