package DAO2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Entidades2.*;

import javax.persistence.*;
import java.util.List;

public class GestorDao {
    static Logger log = LogManager.getRootLogger();
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("clientes");


    //METODO PARA LISTAR TODOS LOS Clientes potenciales
    public List<Gestor> seleccionar() {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("Alumno.findAll", Gestor.class);
        List<Gestor> lista = (List<Gestor>) query1.getResultList();
        em.close();
        return lista;

    }

    //METODO PARA INSERTAR Gestores
    public void insertar(Gestor Gestor) {

        EntityManager em = emfactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        log.debug("Objeto a persistir: " + Gestor);
        em.persist(Gestor);
        tx.commit();
        log.debug("Objeto persistido correctamente " + Gestor);
        em.close();


    }
    //METODO PARA ENCONTRAR Los gestores a cargo de un cliente
    public List<String> Econtrargestor(String nombre) {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("Gestor.findbynombre", Gestor.class);
        query1.setParameter("nombrec", nombre); //indicamos el parametro para encontrar ese nombre
        List<String> lista = (List<String>) query1.getResultList();
        em.close();
        return lista;
    }

}
