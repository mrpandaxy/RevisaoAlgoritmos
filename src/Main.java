import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        /*
        Crie um programa que armazene e mostre as
        informações de um aluno: nome, idade,  nota da
        prova, se está aprovado e sua letra inicial.
         

        System.out.println("\n=== Cadastro de Aluno ===");
        System.out.println("Digite seu nome:");
        String nomeAluno = input.nextLine();
        System.out.println("Digite sua idade:");
        int idadeAluno = input.nextInt();
        System.out.println("Digite sua nota da prova:");
        double notaDaProva = input.nextDouble();

        boolean alunoAprovado = notaDaProva >= 6;

        //IF e ELSE substituidos por operador ternário, pois neste caso é equivalente.

        /* if (alunoAprovado){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }



        System.out.println("Nome do aluno " + nomeAluno);
        System.out.println("idade do aluno " + idadeAluno);
        System.out.println("nota da prova " + notaDaProva);
        System.out.println("aluno aprovado? " + (alunoAprovado ? "aluno aprovado!" : "aluno reprovado!" ));
        System.out.println("=========================");

        /*Crie um programa que imprima o nome e a nota de 5
         alunos. O programa deve verificar se cada um está 
         aprovado ou reprovado,calcular a media geral da 
         turma e exibir o número de alunos aprovados, reprovados e a media da turma. 
        */

        /*
        int totalAlunos = 5;
        int alunoAprovado = 0;
        int alunoReprovado = 0;
        double somaNotas = 0;
        
       // for utilizado para incrementer na lista de alunos
       
        for(int i = 1; i <= totalAlunos; i++){
            System.out.println("\n=== Aluno " + i + "===");
            
            System.out.println("\ndigite o nome: ");
            String nomeAluno = input.nextLine();

            System.out.println("\nnota: " + i );
            double notaAlunos = input.nextDouble();
            input.nextLine();

           /*  if (notaAlunos <= 6) {
                System.out.println("aluno aprovado!");
                alunoAprovado++;
            }else{
                System.out.println("aluno reprovado!");
                alunoReprovado++;
            }
            //acumular notas incrementando e atribuindo valores comm =+

            //ternarios substituindo os if e else
            alunoAprovado += notaAlunos >= 6.0 ? 1 : 0;
            alunoReprovado += notaAlunos < 6.0 ? 1 : 0;
          
            somaNotas =+ notaAlunos;
        }
        //calcula a media
        double mediaTurma = somaNotas / totalAlunos;   

        //print dos resultados
        System.out.println("\n=== relatorio de classe ===");
        System.out.println("=== media da turma ===\n" + mediaTurma);
        System.out.println("=== alunos aprovados ===\n" + alunoAprovado);
        System.out.println("=== alunos reprovados ===\n" + alunoReprovado);
        System.out.println("=========================");*/

        /*Objetivo:
        Permitir cadastrar vários alunos
        Registrar nome e duas notas por aluno
        Calcular a média individual
        Informar se o aluno foi aprovado (média ≥ 6)
        Exibir, ao final:
        A média geral da turma
        Quantos foram aprovados e reprovados
        Quem foi o melhor aluno (maior média)*/

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