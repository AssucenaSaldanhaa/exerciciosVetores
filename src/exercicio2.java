import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        double soma=0, media=0;



        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vetor= new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            soma = soma + vetor[i];
        }
        media= soma/n;

        System.out.println("O valor da soma é: "+ soma );

        System.out.printf("MEDIA = %.2f\n", media);

    }
}
