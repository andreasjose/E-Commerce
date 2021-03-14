/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.AuxProdutoFoto;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andreas
 */
public class AuxProdutoFotoDAOTest {
    

    /**
     * Test of salvar method, of class AuxProdutoFotoDAO.
     */
    @Test
    public void testSalvar() {
        AuxProdutoFoto auxprodutofoto = new AuxProdutoFoto();
        
        AuxProdutoFotoDAO instance = new AuxProdutoFotoDAO();
        instance.salvar(auxprodutofoto);
    }

    /**
     * Test of getALL method, of class AuxProdutoFotoDAO.
     */
    /*@Test
    public void testGetALL() {
        System.out.println("getALL");
        AuxProdutoFotoDAO instance = new AuxProdutoFotoDAO();
        List<AuxProdutoFoto> expResult = null;
        List<AuxProdutoFoto> result = instance.getALL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
