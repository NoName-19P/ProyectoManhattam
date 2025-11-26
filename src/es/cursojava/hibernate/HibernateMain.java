package es.cursojava.hibernate;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {
    	// Iniciar una transacción
    	Transaction tx = null;
        try {
        	// Crear la SessionFactory desde hibernate.cfg.xml
            SessionFactory sessionFactory = new Configuration()
            		
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();// Crear la Session
            Session session = sessionFactory.openSession();// Abrir la sesión
            System.out.println("Conectado");
             
            // Iniciar la transacción
            tx = session.beginTransaction();
            // Crear y guardar entidades Empresa
            Empresa empresa1 = new Empresa("Empresa1","S.A.","123123D","Venta Jabones", 
            					Calendar.getInstance().getTime());
            Empresa empresa2 = new Empresa("Empresa2","S.A.","17645D","Venta FunkoPop", 
            					Calendar.getInstance().getTime());
            // Guardar las entidades
            session.persist(empresa1);
            session.persist(empresa2);
            
            tx.commit();
            // Consultar todas las empresas
            List<Empresa> empresas = session.createQuery("from Empresa", Empresa.class).list();
            // Mostrar las empresas por consola
            for (Empresa empresa : empresas) {
				System.out.println(empresa);
			}
            
            
        } catch (Throwable ex) {
        	try {
        		tx.rollback();
        	}catch (NullPointerException e) {
        		System.out.println("Transacción no creada");
			}
        	
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
