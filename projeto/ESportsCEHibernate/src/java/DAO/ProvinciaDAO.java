/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Provincia;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Andreas
 */
public class ProvinciaDAO {

    private EntityManager em;
    
    public ProvinciaDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(Provincia provincia)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(provincia);
        em.getTransaction().commit();

    }    
    
    public List<Provincia> getALL()
    {
        Query qry = em.createQuery("select P from Entidade.Provincia P");
        List provincias = qry.getResultList();
        return (List<Provincia>) provincias;
    }
    
    
}
