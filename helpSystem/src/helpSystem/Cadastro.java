package helpSystem;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import helpSystem.*;
import helpSystem.*;


public class Cadastro {
	 public void inserir(Usuario usuario) {
	        String sql = "INSERT INTO help_systemid (idCliente, nome, setor, senha, email) VALUES (?, ?, ?, ?, ?)";
	        try (Connection connection   = mysqlConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	            statement.setInt(1, usuario.getidCliente());
	            statement.setString(2, usuario.getNome());
	            statement.setString(3, usuario.getSetor());
	            statement.setString(4, usuario.getSenha());
	            statement.setString(5, usuario.getEmail());

	            statement.executeUpdate();  

	        } catch (SQLException ex) {
	            throw new RuntimeException(ex);
	        }
	    }
	 public void inserirpergunta(Usuario usuario) {
	        String sql = "INSERT INTO help_systemid (idCliente, nome, setor, pergunta) VALUES (?, ?, ?, ?)";
	        try (Connection connection  
	 = mysqlConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	            statement.setInt(1, usuario.getidCliente());
	            statement.setString(2, usuario.getNome());
	            statement.setString(3, usuario.getSetor());
	            statement.setString(4, usuario.getPergunta());

	            statement.executeUpdate();  

	        } catch (SQLException ex) {
	            throw new RuntimeException(ex);
	        }
	    }
	 public void inserirresposta(Usuario usuario) {
	        String sql = "INSERT INTO help_systemid (idCliente, nome, setor, resposta) VALUES (?, ?, ?, ?)";
	        try (Connection connection  
	 = mysqlConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	            statement.setInt(1, usuario.getidCliente());
	            statement.setString(2, usuario.getNome());
	            statement.setString(3, usuario.getSetor());
	            statement.setString(4, usuario.getResposta());

	            statement.executeUpdate();  

	        } catch (SQLException ex) {
	            throw new RuntimeException(ex);
	        }
	    }
	 
}
