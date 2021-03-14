package DAO;

import Entidade.Categoria;
import UTIL.HibernateUtil;
import UTIL.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Andreas
 */
public class CategoriaDAO {
    
    private EntityManager em;
    
    public CategoriaDAO()
    {
        em = Manager.getInstance().getEm();
    }
    
    public void salvar(Categoria categoria)
    {
        //Cria e abre uma sessão
        em.getTransaction().begin();
        
        em.persist(categoria);
        em.getTransaction().commit();

    }
    
    public List<Categoria> getALL()
    {
        Query qry = em.createQuery("select C from Entidade.Categoria C");
        List categorias = qry.getResultList();
        return (List<Categoria>) categorias;
    }
    
    public void remover(Categoria categoria)
    {
        Query query = em.createQuery("delete Entidade.Categoria where idcategoria = :id");
        query.setParameter("id", categoria.getIdcategoria());
        int result = query.executeUpdate();
        if (result > 0) {
            System.out.println("Expensive products was removed");
        }
    }
}
