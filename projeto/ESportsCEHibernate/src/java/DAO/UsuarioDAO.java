/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Usuario;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Andreas
 */
public class UsuarioDAO {
    
    private EntityManager em;
    
    public UsuarioDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(Usuario usuario)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(usuario);
        em.getTransaction().commit();

    }
    
    public List<Usuario> getALL()
    {
        Query qry = em.createQuery("select U from Entidade.Usuario U");
        List usuarios = qry.getResultList();
        return (List<Usuario>) usuarios;
    }
    
    public void remover(Usuario usuario)
    {
        Query query = em.createQuery("delete Entidade.Usuario where idusuario = :id");
        query.setParameter("id", usuario.getIdusuario());
        int result = query.executeUpdate();
        if (result > 0) {
            System.out.println("Expensive products was removed");
        }
    }
        
}
