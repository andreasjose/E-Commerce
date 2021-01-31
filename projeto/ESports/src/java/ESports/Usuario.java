/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ESports;

/**
 *
 * @author Andreas
 */
public class Usuario {
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean logar(String login, String pass)
    {
       
       return true; 
    }
   }
