import java.util.Scanner;
public class Exercicio2CadastroAtleta {
    public static void main(String[] args) {

         /*Exercício 2 – Classificação de atletas
        Peça o nome e a idade de N atletas. Depois classifique cada atleta em:
        -Infantil (até 12 anos);
        -Juvenil (13 a 17);
        -Adulto (18 a 59);
        -Sênior (60 ou mais);
        No fim, exiba:
        -Quantos atletas tem em cada categoria;*/

        Scanner input = new Scanner(System.in);
        System.out.println("=== Cadastro do atleta ===\n");
        System.out.println("Informe a quantidade de atletas que deseja cadastrar: ");
        int totalAtletas = input.nextInt();
        input.nextLine();

        int infantil = 0;
        int juvenil = 0;
        int adulto = 0;
        int senior = 0;
        int maiorIdade = 0;
        int menorIdade = Integer.MAX_VALUE;
        String nomeAtletaMaisVelho = "";
        String nomeAtletaMaisNovo = "";

        for (int i = 1; i <= totalAtletas; i++){
            System.out.println("=== Cadastro do atleta " + i + " ===");

            System.out.println("\n informe o nome do atleta " + i);
            String nomeAtleta = input.nextLine();

            System.out.println("\n informe a idade do atleta " + i);
            int idadeAtleta = input.nextInt();
            input.nextLine();

            System.out.printf("\nStatus do atleta: %s %d anos\n", nomeAtleta , idadeAtleta);

            if (idadeAtleta <= 12){
                infantil++;
            }else if(idadeAtleta <= 17){
                juvenil++;
            }else if(idadeAtleta <= 59){
                adulto++;
            }else{
                senior++;
            }
            if(idadeAtleta > maiorIdade){
                maiorIdade = idadeAtleta;
                nomeAtletaMaisVelho = nomeAtleta;
            }
            if(idadeAtleta < menorIdade){
                menorIdade = idadeAtleta;
                nomeAtletaMaisNovo = nomeAtleta;
            }
        }
        System.out.println("\n=== Relatório Final de Atletas ===");
        System.out.println("Categoria Infantil: " + infantil + " atleta(s)");
        System.out.println("Categoria Juvenil: " + juvenil + " atleta(s)");
        System.out.println("Categoria Adulta: " + adulto + " atleta(s)");
        System.out.println("Categoria Sênior: " + senior + " atleta(s)");
        System.out.printf("Atleta mais novo: %s (%d anos)\n", nomeAtletaMaisNovo, menorIdade);
        System.out.printf("Atleta mais velho: %s (%d anos)\n", nomeAtletaMaisVelho, maiorIdade);
        System.out.println("==================================");

        input.close();
    }
}
