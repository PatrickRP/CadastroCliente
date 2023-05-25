package GerBDdao;

import modelo.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {
    private Connection connection;
    public ProdutoDAO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbcadcliente", "root", "94412210");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public void cadastrarProduto(Produto produto) {
        try {
            String sql = "INSERT INTO produto(cod, preco, nome, ca, modelo, material, fabricante, quantidade) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, produto.getCod());
            statement.setDouble(2, produto.getPreco());
            statement.setString(3, produto.getNome());
            statement.setString(4, produto.getCa());
            statement.setString(5, produto.getModelo());
            statement.setString(6, produto.getMaterial());
            statement.setString(7, produto.getFabricante());
            statement.setInt(8, produto.getQuantidade());

            statement.execute();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir produto: " + e.getMessage());
        }
    }
}
