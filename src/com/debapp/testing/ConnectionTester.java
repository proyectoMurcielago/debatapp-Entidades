package com.debapp.testing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.debappte.entidad.*;

public class ConnectionTester {
	
	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager em = null;
	 
	 public static void main(String[] args) {
		 
		 Modelo australiano = new Modelo();
		 Etapa inicial= new Etapa(), preguntas= new Etapa(), Efinal = new Etapa();
		 Debate debate = new Debate();
		 Posicion p1 = new Posicion(), p2 = new Posicion();
		 //Pregunta preg = new Pregunta();
		 
		 //etapas
		 inicial.setDuracionMaxima(5);
		 inicial.setDuracionMinima(3);
		 inicial.setNombre("inicial test");
		 inicial.setReiteraciones(1);
		 
		 preguntas.setDuracionMaxima(5);
		 preguntas.setDuracionMinima(3);
		 preguntas.setNombre("preguntas test");
		 preguntas.setReiteraciones(5);
		 
		 Efinal.setDuracionMaxima(5);
		 Efinal.setDuracionMinima(3);
		 Efinal.setNombre("final test");
		 Efinal.setReiteraciones(2);
		 
		 List<Etapa> etapas = new ArrayList<Etapa>();
		 etapas.add(inicial);
		 etapas.add(preguntas);
		 etapas.add(Efinal);
		 
		 //modelo
		 australiano.setEtapas(etapas);
		 australiano.setNombre("Australiano Test");
		 
		 //posiciones
		 p1.setNombre("Team test A");
		 p2.setNombre("Team test B");
		 p1.setDebate(null); p2.setDebate(null);
		 List<Posicion> posiciones = new ArrayList<Posicion>();
		 posiciones.add(p1);
		 posiciones.add(p2);
		 
		 //debate
		 debate.setModelo(australiano);
		 debate.setNombre("debate test");
		 debate.setFechaInicial(new Date());
		 debate.setPosiciones(posiciones);
		 debate.setParticipantes(null);
		 debate.setPreguntas(null);
		
		
		/* Usuario u = new Usuario("Daniel", "Vega", "Coto","c.daniel.vega@gmail.com","clave");
		 u.setNombre("Daniel");*/
		 startEntityManagerFactory();
		
		 em.getTransaction().begin();
		 System.out.println(debate.getNombre());
		 em.persist(debate);
		 em.getTransaction().commit();
		 
		 stopEntityManagerFactory();
		 
		}
	 
	 
	 public static void startEntityManagerFactory(){
			
			if(entityManagerFactory == null){
				try{
					entityManagerFactory = Persistence.createEntityManagerFactory("debatappEntities");
					em = entityManagerFactory.createEntityManager();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
			
		}
	 
	 public static void stopEntityManagerFactory(){
			
			if(entityManagerFactory != null){
				if (entityManagerFactory.isOpen()) {
					try{
						entityManagerFactory.close();
					} catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			
		} 

	 
}
