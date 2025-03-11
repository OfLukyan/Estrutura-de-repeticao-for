import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("quantos números vão ser somados?");

        int N = entrada.nextInt();
        int soma = 0;
        System.out.println("digite os números que vão ser somados");
        for (int i=0; i<N; i++ ) {
            int x = entrada.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        entrada.close();
    }
}