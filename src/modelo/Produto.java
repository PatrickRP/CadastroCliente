package modelo;

public class Produto {
    int codigo;
    double preco;
    String nome;
    String ca;
    String modelo;
    String material;
    String fabricante;
    int quantidade;

    public Produto buscarProduto(int codProuto){

    }
    public boolean existeProduto(int codProduto, String nome){
        return true;
    }
    public boolean conferirEstoque(Produto p, int qtdProduto){
        return true;
    }
    
}
