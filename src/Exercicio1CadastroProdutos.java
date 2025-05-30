import java.util.Scanner;

public class Exercicio1CadastroProdutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /*iniciando a revisão do que foi praticado até o momento.
        Exercício 1 – Cadastro e status de 5 produtos
        Cadastre o nome e o preço de 5 produtos. Depois, mostre:
        -O nome e o preço de cada um;
        -Qual produto foi o mais caro;
        -Qual foi o mais barato;
        -Qual é o preço médio dos produtos;
        Dica: use variáveis para guardar o maior e menor preço e seus nomes associados.*/

        System.out.println("=== Registro de produtos === ");

        int produtos = 5;
        double produtoMaisCaro = 0;
        double produtoMaisBarato = Double.MAX_VALUE; // Inicializa com o maior valor possível;
        double somaProdutos = 0;
        String nomeProdutoMaisCaro = "";
        String nomeProdutoMaisBarato = "";

        for (int i = 1; i <= produtos; i++){
            System.out.println("\nDigite o nome do produto " + i);
            String nomeProduto = input.nextLine();

            System.out.println("\nInforme o valor do produto cadastrado " + i);
            double valorProduto = input.nextDouble();
            input.nextLine();

           System.out.printf("Produto cadastrado: %s R$ %.2f\n" , nomeProduto, valorProduto);

            somaProdutos += valorProduto;

            if(valorProduto > produtoMaisCaro){
               produtoMaisCaro = valorProduto;
               nomeProdutoMaisCaro = nomeProduto;
           }
            if(valorProduto < produtoMaisBarato){
                produtoMaisBarato = valorProduto;
                nomeProdutoMaisBarato = nomeProduto;
            }
        }
        double mediaProdutos = somaProdutos / produtos;

        System.out.println("\n=== relatorio de produtos ===");
        System.out.printf("=== nome do produto mais caro ===\n %s - R$ %.2f\n", nomeProdutoMaisCaro , produtoMaisCaro);
        System.out.printf("=== nome do produto mais barato  ===\n %s - R$ %.2f\n", nomeProdutoMaisBarato , produtoMaisBarato);
        System.out.printf("=== valor medio dos produtos  ===\n %.2f\n", mediaProdutos);
        System.out.println("=========================");

        input.close();
    }
}
