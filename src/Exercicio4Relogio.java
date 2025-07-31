public class Exercicio4Relogio {
        public static void main(String[] args) {

            /*EXERCÍCIO 1 – Simulador de Relógio até 02:59
           🎯 Objetivo:
           Simular o funcionamento de um relógio das 00:00 até 02:59,
           imprimindo todos os horários nesse intervalo.*/

            for (int hora = 0; hora <= 2; hora ++){
                for ( int minuto = 0; minuto <= 59; minuto ++) {
                    for (int segundo = 0; segundo <= 59; segundo ++) {

                        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);


                    }
                }
            }


        }
    }