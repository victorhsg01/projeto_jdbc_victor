package com.eleodoro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eleodoro.conexao.Conexao;
import com.eleodoro.modelo.Estoque;


public class EstoqueDao{

   private final String SQLINCLUIR = "INSERT INTO TURMA VALUES (?, ?, ?)";
   private final String SQLALTERAR = "UPDATE TURMA SET CAPACIDADE = ?, HORARIO = ? WHERE ID = ?";
   private final String SQLEXCLUIR = "DELETE FROM TURMA WHERE ID = ?";
   private final String SQLCONSULTAR = "SELECT * FROM TURMA WHERE ID = ?";

    public EstoqueDao() {        
    }

   public boolean incluir(EstoquePOJO estoquePojo){
         try {

            PreparedStatement ps = Conexao.getConexao().prepareStatement(SQLINCLUIR);
            ps.setInt(1, estoquePojo.getCapacidade());
            ps.executeUpdate();
            return true;
            } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possivel incluir a capacidade");
            return false;
            }
      }

   public boolean alterar(Estoque estoque2){
        try {
           PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLALTERAR);
           ps.setInt(2, estoquePojo.getCapacidade());
           ps.executeUpdate();
           return true;
           } catch (SQLException e) {
           e.printStackTrace();
           System.out.println("Não foi possivel alterar a capacidade");
           return false;
      }
   }

   public boolean excluir(){
      try {
         PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLEXCLUIR);
         ps.setInt(1, EstoquePojo.getCapacidade());
         ps.executeUpdate();
         return true;
         } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("Não foi possivel excluir a capacidade");
         return false;
      }
   }

   public boolean consultar(){
      try {
         PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLCONSULTAR);
         ResultSet rs = ps.executeQuery();
         if (rs.next()) {
         estoquePojo.setCapacidade(rs.getInt(1));
         }
         ps.executeUpdate();
         return true;
          } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("Não foi possivel consultar a capacidade");
         return false;
      }
   }

   public Estoque getEstoque() {
      return null;
   }
}