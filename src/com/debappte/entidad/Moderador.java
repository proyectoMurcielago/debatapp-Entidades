package com.debappte.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Moderador
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Moderador extends Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Moderador() {
		super();
	}
   
}
