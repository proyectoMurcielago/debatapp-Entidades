package com.debappte.entidad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * This class manage the conection of the DB
 * openConnection and closeConnection can open and close db connections
 * in order to do the transactions.
 * With getEntityManagerInstance() you will recieve an instance of the
 * entityManager in order to begin, doing the query and commit/rollback, 
 * your transac.
 * 
 */
public class ConnectionManager {
	private EntityManagerFactory entityManagerFactory = null;
	private EntityManager em = null;
	
	
	public  void openConnection	(){
		
		if(entityManagerFactory == null){
			try{
				entityManagerFactory = Persistence.createEntityManagerFactory("debatappEntities");
				em = entityManagerFactory.createEntityManager();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	public EntityManager getEntityManagerInstance(){
		if(entityManagerFactory == null){
			try{
				entityManagerFactory = Persistence.createEntityManagerFactory("debatappEntities");
				em = entityManagerFactory.createEntityManager();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
		return em;
	}
	
	public  void closeConnection(){
		
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
