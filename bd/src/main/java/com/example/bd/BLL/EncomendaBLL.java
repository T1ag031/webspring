package com.example.bd.BLL;

import com.example.bd.DAL.Admin;
import com.example.bd.DAL.Encomenda;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

public class EncomendaBLL implements Serializable {
    private static final String PERSISTENCE_UNIT_NAME = "default";
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    public static List<Encomenda> findAEncomendaEntities() {
        List<Encomenda> admins;
        EntityManager em = getEntityManager();
        CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Encomenda.class));
        Query q = em.createQuery(cq);
        admins=((List<Encomenda>) q.getResultList());
        em.close();
        return admins;
    }
}
