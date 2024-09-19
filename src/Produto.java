public class Produto {
    String nome = "Caderno";
    double preco = 15.0;
    int quantidade = 100;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Caderno", 15.00, 100);


        System.out.println("Valor total do estoque: R$ " + produto.calcularValorEstoque());
    }
}
