package com.debappte.entidad;

import com.debappte.entidad.Participante;
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Asesor
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@XmlRootElement
public class Asesor extends Participante implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Asesor() {
		super();
	}
   
}
