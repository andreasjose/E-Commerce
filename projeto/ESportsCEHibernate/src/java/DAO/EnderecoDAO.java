/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entidade.Endereco;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Andreas
 */
public class EnderecoDAO {
    
    
    private EntityManager em;
    
    public EnderecoDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(Endereco endereco)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(endereco);
        em.getTransaction().commit();

    }
    
    public List<Endereco> getALL()
    {
        Query qry = em.createQuery("select E from Entidade.Endereco E");
        List enderecos = qry.getResultList();
        return (List<Endereco>) enderecos;
    }
}
