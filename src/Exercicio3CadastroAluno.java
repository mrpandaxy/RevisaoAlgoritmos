import java.util.Scanner;

public class Exercicio3CadastroAluno {
    public static void main(String[] args) {

    /*Objetivo:
    Permitir cadastrar vários alunos
    Registrar nome e duas notas por aluno
    Calcular a média individual
    Informar se o aluno foi aprovado (média ≥ 6)
    Exibir, ao final:
    A média geral da turma
    Quantos foram aprovados e reprovados
    Quem foi o melhor aluno (maior média)*/

        Scanner input = new Scanner(System.in);

        System.out.println("=== Quantos alunos deseja cadastrar? ===");
        int totalAlunos = input.nextInt();
        input.nextLine();

        double somaTurma = 0;
        int aprovados = 0;
        int reprovados = 0;
        double maiorMedia = 0;
        String melhorAluno = "";

        for (int i = 1; i <= totalAlunos; i++){
            System.out.println("\n=== Aluno " + i + "===");

            System.out.println("\ndigite o nome: ");
            String nomeAluno = input.nextLine();

            System.out.println("\nnota 1: " + i );
            double notaAluno1 = input.nextDouble();
            input.nextLine();

            System.out.println("\nnota 2: " + i );
            double notaAluno2 = input.nextDouble();
            input.nextLine();

            double mediaAluno = (notaAluno1 + notaAluno2) / 2;
            somaTurma += mediaAluno;

           String status = mediaAluno >= 6 ? "aprovado" : "reprovado";
           System.out.println("Aluno " + nomeAluno + " foi " + status);

            if(mediaAluno >= 6){
                aprovados++;
            }else
                reprovados++;
            if(mediaAluno > maiorMedia){
                maiorMedia = mediaAluno;
                melhorAluno = nomeAluno;
            }
        }
        double mediaTurma = somaTurma / totalAlunos;

        System.out.println("\n=== relatorio de classe ===");
        System.out.printf("=== media da turma  ===\n %.2f\n", mediaTurma);
        System.out.println("=== alunos aprovados ===\n" + aprovados);
        System.out.println("=== alunos reprovados ===\n" + reprovados);
        System.out.println("=== melhor aluno ===\n" + melhorAluno);
        System.out.println("=========================");

        input.close();
    }
}
