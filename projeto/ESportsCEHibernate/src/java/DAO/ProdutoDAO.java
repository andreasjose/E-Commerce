/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Andreas
 */

import Entidade.Produto;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ProdutoDAO {
   
    private EntityManager em;
    
    public ProdutoDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(Produto produto)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(produto);
        em.getTransaction().commit();

    }
    
    public List<Produto> getALL()
    {
        Query qry = em.createQuery("select p from Entidade.produto p");
        List produto = qry.getResultList();
        return (List<Produto>) produto;
    }
}
