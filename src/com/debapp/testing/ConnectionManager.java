package com.debapp.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.debappte.entidad.Usuario;

public class ConnectionManager {
	
	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager em = null;
	 
	 public static void main(String[] args) {
		 
		Usuario u = new Usuario();//new Usuario("Daniel", "Vega", "Coto","c.daniel.vega@gmail.com","clave");
		 u.setNombre("Daniel");
		startEntityManagerFactory();
		
		 em.getTransaction().begin();
		 em.persist(u);
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
