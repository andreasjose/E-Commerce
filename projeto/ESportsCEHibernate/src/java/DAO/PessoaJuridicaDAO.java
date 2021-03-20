/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.PessoaJuridica;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Andreas
 */
public class PessoaJuridicaDAO {
    
    private EntityManager em;
    
    public PessoaJuridicaDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(PessoaJuridica pessoajuridica)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(pessoajuridica);
        em.getTransaction().commit();

    }
    
    public List<PessoaJuridica> getALL()
    {
        Query qry = em.createQuery("select p from Entidade.pessoajuridica p");
        List pessoajuridica = qry.getResultList();
        return (List<PessoaJuridica>) pessoajuridica;
    }    
}
