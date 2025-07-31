public class Exercicio5Contador {
    public static void main(String[] args) {

        //sem ternário
       /* for (int i = 0; i <= 20; i ++) {
            if (i % 2 == 0){
                System.out.println(i + " par");
            }else{
                System.out.println(i + " impar");
            }
        }*/

      //com ternario
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d %s%n", i, (i % 2 == 0 ? "par" : "impar"));
        }

    }


}

