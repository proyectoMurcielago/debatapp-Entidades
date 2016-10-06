package com.debappte.entidad;

import com.debappte.entidad.Participante;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Debatiente
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Debatiente extends Participante implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Debatiente() {
		super();
	}
   
}
