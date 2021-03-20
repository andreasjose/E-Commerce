/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Estoque;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Andreas
 */
public class EstoqueDAO {
    
    private EntityManager em;
    
    public EstoqueDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(Estoque estoque)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(estoque);
        em.getTransaction().commit();

    }
    
    public List<Estoque> getALL()
    {
        Query qry = em.createQuery("select E from Entidade.Estoque E");
        List produtos = qry.getResultList();
        return (List<Estoque>) produtos;
    }
    
    public void remover(Estoque estoque)
    {
        Query query = em.createQuery("delete Entidade.Estoque where idestoque = :id");
        query.setParameter("id", estoque.getIdestoque());
        int result = query.executeUpdate();
        if (result > 0) {
            System.out.println("Expensive products was removed");
        }
    }
}
