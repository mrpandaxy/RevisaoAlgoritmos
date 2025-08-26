import java.util.Scanner;

public class InicioDeEstudo {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        /*
        Crie um programa que armazene e mostre as
        informações de um aluno: nome, idade,  nota da
        prova, se está aprovado e sua letra inicial.*/

        System.out.println("\n=== Cadastro de Aluno ===");
        System.out.println("Digite seu nome:");
        String nomeAluno = input.nextLine();
        System.out.println("Digite sua idade:");
        int idadeAluno = input.nextInt();
        System.out.println("Digite sua nota da prova:");
        double notaDaProva = input.nextDouble();

        boolean alunoAprovado = notaDaProva >= 6;

        //IF e ELSE substituidos por operador ternário, pois neste caso é equivalente.

        if (alunoAprovado){
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



        input.close();
    }
}