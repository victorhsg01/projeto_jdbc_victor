package com.eleodoro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.eleodoro.conexao.Conexao;
import com.eleodoro.dao.EstoqueDao;
import com.eleodoro.modelo.Estoque;

/**
 * Hello world!
 *
 */

public class App
{
    

    public static void main( String[] args ) {
        /*
        Conexao conexao = new Conexao();
        conexao.getConexao();
        */

        

        EstoqueDao estoqueDao = new EstoqueDao();

         // Exemplo de utilização do método incluir()
        
        // Criação de um objeto da classe que contém o método incluir()
        EstoqueDao estoqueDAO = new EstoqueDao();
        
        // Criação de um objeto de Estoque para passar como parâmetro
        Estoque estoque = new Estoque();
        estoque.setCapacidade(100); // Exemplo de capacidade qualquer
        
        // Chamada do método incluir()
        boolean incluiuComSucesso = estoqueDAO.incluir(estoque);
        
        // Verificação do resultado
        if (incluiuComSucesso) {
            System.out.println("Capacidade incluída com sucesso!");
        } else {
            System.out.println("Falha ao incluir a capacidade.");
        }
        





        
        
         // Exemplo de utilização do método alterar()

        // Criação de um objeto da classe que contém o método alterar()

        // Criação de um objeto de Estoque para passar como parâmetro
        EstoquePOJO estoque1 = new Estoque();
        estoque.setId(1); // Supondo que o estoque com id 1 já existe no banco de dados
        estoque.setCapacidade(200); // Novo valor de capacidade

        // Chamada do método alterar()
        boolean alterouComSucesso = estoqueDAO.alterar(estoque);

        // Verificação do resultado
        if (alterouComSucesso) {
            System.out.println("Capacidade alterada com sucesso!");
        } else {
            System.out.println("Falha ao alterar a capacidade.");
        }
        





         
         // Exemplo de utilização do método excluir()

        // Criação de um objeto da classe que contém o método excluir()

        // Criação de um objeto de Estoque para passar como parâmetro
        EstoquePOJO estoque2 = new Estoque();
        estoque.setCapacidade(100); // Valor qualquer para capacidade

        // Chamada do método excluir()
        boolean excluiuComSucesso = estoque.excluir(estoque);

        // Verificação do resultado
        if (excluiuComSucesso) {
            System.out.println("Capacidade excluída com sucesso!");
        } else {
            System.out.println("Falha ao excluir a capacidade.");
        }
       


       
         
       // Exemplo de utilização do método consultar()

        // Criação de um objeto da classe que contém o método consultar()

        // Chamada do método consultar()
        boolean consultouComSucesso = estoqueDAO.consultar();

        // Verificação do resultado
        if (consultouComSucesso) {
            System.out.println("Capacidade consultada com sucesso: " + estoqueDAO.getEstoque().getCapacidade());
        } else {
            System.out.println("Falha ao consultar a capacidade.");
        }
        



    }
    
}

