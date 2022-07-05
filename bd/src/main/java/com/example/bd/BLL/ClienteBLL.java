package com.example.bd.BLL;

import com.example.bd.DAL.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

public class ClienteBLL implements Serializable {
    private static final String PERSISTENCE_UNIT_NAME = "default";
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static List<Cliente> findClienteEntities() {
        List<Cliente> clis;
        EntityManager em = getEntityManager();
        CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Cliente.class));
        Query q = em.createQuery(cq);
        clis=((List<Cliente>) q.getResultList());
        em.close();
        return clis;
    }

    //CRIAR CLIENTE
    public static void create(Cliente cliente) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static Cliente verifyLoginWeb(Cliente user) {
        for(Cliente c : ClienteBLL.findClienteEntities()) {
            if(c.getUsername().equals(user.getUsername()) && c.getPassword().equals(user.getPassword())) {
                return c;
            }
        }
        return null;
    }


    //EDITAR CADA DADO DO CLIENTE
    public static void editNomeCliente(int cod, String nome){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Cliente cliente;
        em.getTransaction().begin();
        cliente = em.find(Cliente.class, cod);
        cliente.setNome(nome);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static void editNifCliente(int cod, int nif){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Cliente cliente;
        em.getTransaction().begin();
        cliente = em.find(Cliente.class, cod);
        cliente.setNif(nif);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static void editEmailCliente(int cod, String email){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Cliente cliente;
        em.getTransaction().begin();
        cliente = em.find(Cliente.class, cod);
        cliente.setEmail(email);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static void editCPostalCliente(int cod, String codpostal){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Cliente cliente;
        em.getTransaction().begin();
        cliente = em.find(Cliente.class, cod);
        cliente.setCodpostal(codpostal);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static void editRuaCliente(int cod, String rua){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Cliente cliente;
        em.getTransaction().begin();
        cliente = em.find(Cliente.class, cod);
        cliente.setRua(rua);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static void editNPortaCliente(int cod, int nporta){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Cliente cliente;
        em.getTransaction().begin();
        cliente = em.find(Cliente.class, cod);
        cliente.setNporta(nporta);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static void editPasswordCliente(int cod, String pass){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Cliente cliente;
        em.getTransaction().begin();
        cliente = em.find(Cliente.class, cod);
        cliente.setPassword(pass);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static void editUserCliente(int cod, String user){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Cliente cliente;
        em.getTransaction().begin();
        cliente = em.find(Cliente.class, cod);
        cliente.setUsername(user);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

}
