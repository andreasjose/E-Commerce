/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Categoria;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andreas
 */
public class CategoriaDAOTest {
    

    /**
     * Test of salvar method, of class CategoriaDAO.
     */
    @Test
    public void testSalvar() {
        Categoria categoria = new Categoria();
        categoria.setDescricao("teste");
        CategoriaDAO instance = new CategoriaDAO();
        instance.salvar(categoria);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getALL method, of class CategoriaDAO.
     */
    @Test
    public void testGetALL() {
        CategoriaDAO instance = new CategoriaDAO();
        List<Categoria> result = instance.getALL();
        Categoria itera = new Categoria();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            itera = (Categoria) it.next();
            System.out.println(itera.getIdcategoria() + " " + itera.getDescricao());
        }
    }

    /**
     * Test of remover method, of class CategoriaDAO.
     */
    /*@Test
    public void testRemover() {
        Categoria categoria = new Categoria();
        CategoriaDAO instance = new CategoriaDAO();
        categoria.setIdcategoria(10);
        instance.remover(categoria);
        // TODO review the generated test code and remove the default call to fail.
    }*/
    
}
