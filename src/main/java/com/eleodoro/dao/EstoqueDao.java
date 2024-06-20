package com.eleodoro.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eleodoro.conexao.Conexao;
import com.eleodoro.modelo.Estoque;


public class EstoqueDao{

    private Estoque estoque;
    private final String SQLINCLUIR = "INSERT INTO TURMA VALUES (?, ?, ?)";
    private final String SQLALTERAR = "UPDATE TURMA SET CAPACIDADE = ?, HORARIO = ? WHERE ID = ?";
    private final String SQLEXCLUIR = "DELETE FROM TURMA WHERE ID = ?";
    private final String SQLCONSULTAR = "SELECT * FROM TURMA WHERE ID = ?";

    public EstoqueDao (Estoque estoque) {
        this.estoque = estoque;
    }

    public boolean incluir(){
         try {
            PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLINCLUIR);
            ps.setInt(1, estoque.getCapacidade());
            ps.executeUpdate();
            return true;
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possivel incluir a turma");
            return false;
         }
    }

    public boolean alterar(){
        try {
           PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLALTERAR);
           ps.setInt(2, estoque.getCapacidade());
           ps.executeUpdate();
           return true;
        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println("Não foi possivel alterar a turma");
           return false;
        }
   }

   public boolean excluir(){
    try {
       PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLEXCLUIR);
       ps.setInt(1, estoque.getCapacidade());
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel excluir a turma");
       return false;
    }
}

public boolean consultar(){
    try {
       PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLCONSULTAR);
       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
        estoque.setCapacidade(rs.getInt(1));
       }
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel consultar a turma");
       return false;
    }
}
}