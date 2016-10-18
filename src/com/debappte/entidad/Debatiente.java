package com.debappte.entidad;

import com.debappte.entidad.Participante;
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Debatiente
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@XmlRootElement
public class Debatiente extends Participante implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Debatiente() {
		super();
	}
   
}
