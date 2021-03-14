/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.AuxProdutoFoto;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Andreas
 */
public class AuxProdutoFotoDAO {
   
    private EntityManager em;
    
    public AuxProdutoFotoDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(AuxProdutoFoto auxprodutofoto)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(auxprodutofoto);
        em.getTransaction().commit();

    }    
    
    public List<AuxProdutoFoto> getALL()
    {
        Query qry = em.createQuery("Select * from auxprodutofoto");
        List auxprodutofoto = qry.getResultList();
        return (List<AuxProdutoFoto>) auxprodutofoto;
    }
}
