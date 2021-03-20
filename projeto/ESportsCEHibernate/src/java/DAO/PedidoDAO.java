/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Pedido;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
/**
 *
 * @author Andreas
 */
public class PedidoDAO {
    private EntityManager em;
    
    public PedidoDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(Pedido pedido)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(pedido);
        em.getTransaction().commit();

    }
    
    public List<Pedido> getALL()
    {
        Query qry = em.createQuery("select E from Entidade.Estoque E");
        List pedidos = qry.getResultList();
        return (List<Pedido>) pedidos;
    }
    
    public void remover(Pedido pedido)
    {
        Query query = em.createQuery("delete Entidade.Pedido where idestoque = :id");
        query.setParameter("id", pedido.getIdpedido());
        int result = query.executeUpdate();
        if (result > 0) {
            System.out.println("Expensive products was removed");
        }
    }
}
