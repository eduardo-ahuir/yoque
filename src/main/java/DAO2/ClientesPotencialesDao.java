package DAO2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Entidades2.*;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

public class ClientesPotencialesDao {
    static Logger log = LogManager.getRootLogger();
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("clientes");



    //METODO PARA INSERTAR Clientes potenciales
    public void insertar(ClientesPotenciale ClientesPotenciale) {
        Scanner tcl = new Scanner(System.in);

        EntityManager em = emfactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(ClientesPotenciale);
        tx.commit();

        em.close();


    }

    //METODO PARA ENCONTRAR EL CORREO DE LOS CLIENTES POTENCIALES QUE NO SON VIP
    public static List<String> encontrarcorreo() {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("ClientesPotenciale.findBycorreo", ClientesPotenciale.class);
        List<String> lista = (List<String>) query1.getResultList();
        em.close();
        return lista;
    }



}

