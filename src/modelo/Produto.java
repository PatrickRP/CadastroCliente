package modelo;

public class Produto {
<<<<<<< HEAD
    int codigo;
=======
    String cod;
>>>>>>> e07dfcd65aa243e97bb1cc85c40295bb92f09822
    double preco;
    String nome;
    String ca;
    String modelo;
    String material;
    String fabricante;
    int quantidade;

<<<<<<< HEAD
    public Produto buscarProduto(int codProuto){

    }
    public boolean existeProduto(int codProduto, String nome){
        return true;
    }
    public boolean conferirEstoque(Produto p, int qtdProduto){
        return true;
    }
    
=======
    public String getCod() { return cod; }
    public void setCod(String cod) { this.cod = cod; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCa() { return ca; }
    public void setCa(String ca) { this.ca = ca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
>>>>>>> e07dfcd65aa243e97bb1cc85c40295bb92f09822
}
