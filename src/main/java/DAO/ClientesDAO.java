package DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Entidades.*;

import javax.persistence.*;
import java.util.List;

public class ClientesDAO {
    static Logger log = LogManager.getRootLogger();
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("clientes");




    //METODO PARA INSERTAR Clientes potenciales
    public void insertar(Clientes Clientesd) {

        EntityManager em = emfactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(Clientesd);
        tx.commit();

        em.close();


    }

    


}