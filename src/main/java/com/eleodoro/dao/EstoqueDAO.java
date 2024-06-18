package com.eleodoro.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.eleodoro.conexao.Conexao;

public class EstoqueDAO {

    public void Estoque(EstoquePOJO estoquePojo){

        Conexao conexao = new Conexao();

        String sql = "insert into estoque (capacidade) values (?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            
            ps.setInt(1, estoquePojo.getCapacidade());
            
            ps.execute();
            ps.close();

            System.out.println("Dados gravadas com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Houve um problema no EstoqueDAO");
        }
    
    }
    
}