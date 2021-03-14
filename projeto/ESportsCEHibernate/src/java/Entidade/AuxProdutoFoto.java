/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Andreas
 */
@Entity(name = "auxprodutofoto")
public class AuxProdutoFoto {
    
    @Id
    @Column(name = "idproduto")
    private int idproduto;
    @Column(name = "idfotoproduto")
    private int idfotoproduto;

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public int getIdfotoproduto() {
        return idfotoproduto;
    }

    public void setIdfotoproduto(int idfotoproduto) {
        this.idfotoproduto = idfotoproduto;
    }
    
}
