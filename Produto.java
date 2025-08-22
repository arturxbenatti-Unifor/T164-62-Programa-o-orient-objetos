public class Produto {
private     String nome;
  private    double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
    public void exibirProduto(String nome, double preco){
        System.out.println(nome + " custa: " + preco + " R$" );
    }
}
