import java.util.Scanner;
import java.util.Locale;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vetor= new int[n];


        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }

    }
}