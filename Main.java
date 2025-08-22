//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setNome("Coca De 4 Litros");
        produto1.setPreco(24.50);
        produto1.exibirProduto(produto1.getNome(), produto1.getPreco());
        Venda venda1 = new Venda();
        venda1.setProduto(produto1);
        venda1.setQuantidade(2);

        System.out.println("preco final = " + venda1.calcularTotal() + " R$");
    }
}
