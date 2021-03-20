/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.SubCategoria;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Andreas
 */
public class SubCategoriaDAO {
    private EntityManager em;
    
    public SubCategoriaDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(SubCategoria subcategoria)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(subcategoria);
        em.getTransaction().commit();

    }
    
    public List<SubCategoria> getALL()
    {
        Query qry = em.createQuery("select S from Entidade.SubCategoria S");
        List subcategoria = qry.getResultList();
        return (List<SubCategoria>) subcategoria;
    }
    
    /*public void remover(SubCategoria categoria)
    {
        Query query = em.createQuery("delete Entidade.Categoria where idcategoria = :id");
        query.setParameter("id", categoria.getIdcategoria());
        int result = query.executeUpdate();
        if (result > 0) {
            System.out.println("Expensive products was removed");
        }
    }*/
}
