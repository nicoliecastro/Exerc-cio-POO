import java.util.Scanner;

public class Produto {
    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para calcular o valor total no estoque
    public double totalEstoque() {
        return preco * quantidade;
    }

    // Método para adicionar produtos ao estoque
    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    // Método para remover produtos do estoque
    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override 
    // Método para exibir as informações do produto
    public String toString() {
        return "Produto: " + nome
                + ", Preço: R$ " + String.format("%.2f", preco)
                + ", Quantidade em estoque: " + quantidade
                + ", Total em estoque: R$ " + String.format("%.2f", totalEstoque());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine(); // Consome a quebra de linha

        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha

        Produto produto = new Produto(nome, preco, quantidade);

        // Mostrar os dados do produto
        System.out.println("\nDados do produto: " + produto.toString());

        // Entrada para adicionar ao estoque
        System.out.print("\nDigite a quantidade de produtos para adicionar ao estoque: ");
        int addQtd = sc.nextInt();
        produto.addProdutos(addQtd);
        System.out.println("\nDados atualizados: " + produto.toString());

        // Entrada para remover do estoque
        System.out.print("\nDigite a quantidade de produtos para remover do estoque: ");
        int removeQtd = sc.nextInt();
        produto.removerProdutos(removeQtd);
        System.out.println("\nDados atualizados: " + produto.toString());

        sc.close();
    }
}
