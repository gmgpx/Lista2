import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double n = scanner.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + n + " é " + raiz);
        } else {
            System.out.println("Valor inválido!");
        }

    }
}
