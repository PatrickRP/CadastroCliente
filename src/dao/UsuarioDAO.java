package dao;

import factory.ConnectionDB;
import modelo.Usuario;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    private Connection connection;
    String cnpj;
    String nome;
    String cep;
    String endereco;
    String cidade;
    String estado;
    String telefone;
    String email;
    String inscricaoEstadual;

    public UsuarioDAO() {
        this.connection = (Connection) new ConnectionDB();
    }
    public void add(Usuario usuario) {

        String sql = "INSERT INTO usuario(cnpj, nome, cep, endereco, cidade, estado, telefone, email, inscricaoEstadual) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, usuario.getCnpj());
            statement.setString(2, usuario.getNome());
            statement.setString(3, usuario.getCep());
            statement.setString(4, usuario.getEndereco());
            statement.setString(5, usuario.getCidade());
            statement.setString(6, usuario.getEstado());
            statement.setString(7, usuario.getTelefone());
            statement.setString(8, usuario.getEmail());
            statement.setString(9, usuario.getInscricaoEstadual());

            statement.execute();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
