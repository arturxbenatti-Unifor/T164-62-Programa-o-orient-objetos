public class Venda {

    private int quantidade;
private Produto produto;
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double calcularTotal(){
    return produto.getPreco() * this.quantidade;
    }
}
