package GerBDdao;


import modelo.Cliente;

import java.sql.*;
import java.sql.Connection;

public class ClienteDAO {
    private Connection connection;

    public ClienteDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbcadcliente", "root", "94412210");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    
    public void add(Cliente cliente) {
        try {
            String sql = "INSERT INTO cliente(cnpj, nome, cep, endereco, cidade, estado, telefone, email, inscricao_estadual) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, cliente.getCnpj());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getCep());
            statement.setString(4, cliente.getEndereco());
            statement.setString(5, cliente.getCidade());
            statement.setString(6, cliente.getEstado());
            statement.setString(7, cliente.getTelefone());
            statement.setString(8, cliente.getEmail());
            statement.setString(9, cliente.getInscricao_estadual());

            statement.execute();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir cliente: " + e.getMessage());
        }
    }

    public void atualiza(Cliente cliente) {
        try {
            String sql = "UPDATE cliente SET cnpj=?, nome=?, cep=?, endereco=?, cidade=?, estado=?, telefone=?, email=?, inscricao_estadual=? WHERE cnpj=?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, cliente.getCnpj());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getCep());
            statement.setString(4, cliente.getEndereco());
            statement.setString(5, cliente.getCidade());
            statement.setString(6, cliente.getEstado());
            statement.setString(7, cliente.getTelefone());
            statement.setString(8, cliente.getEmail());
            statement.setString(9, cliente.getInscricao_estadual());

            statement.execute();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar cliente: " + e.getMessage());
        }
    }

    public void excluir(String cnpj) {
        try {
            String sql = "DELETE FROM cliente WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, cnpj);
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir cliente: " + e.getMessage());
        }
    }
}
