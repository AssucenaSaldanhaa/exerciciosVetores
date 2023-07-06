import java.util.Locale;
import java.util.Scanner;

public class exercicio4{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            int n, qtdpares;
            System.out.print("Quantos numeros voce vai digitar? ");
            n = sc.nextInt();

            int[] vetor = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Digite um numero: ");
                vetor[i] = sc.nextInt();
            }
            qtdpares = 0;
            for (int i = 0; i < n; i++) {
                if (vetor[i] % 2 == 0) {
                    System.out.printf("%d  ", vetor[i]);
                    qtdpares++;
                }
            }

            System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

            sc.close();
        }

    }
