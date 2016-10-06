package com.debappte.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Participante
 *
 */
@Entity

public class Participante implements Serializable {
	@Id @GeneratedValue @ManyToOne
	private long id;
	
	
	private static final long serialVersionUID = 1L;

	public Participante() {
		super();
	}
   
}
