import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double numero1;
        double numero2;
        double numero3;
        double numero4;
        double numero5;
        double media=0;

        System.out.println("Digite o numero 1 a ser calculado na media: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o numero 2 a ser calculado na media: ");
        numero2 = scanner.nextDouble();

        System.out.println("Digite o numero 3 a ser calculado na media: ");
        numero3 = scanner.nextDouble();

        System.out.println("Digite o numero 4 a ser calculado na media: ");
        numero4 = scanner.nextDouble();

        System.out.println("Digite o numero 5 a ser calculado na media: ");
        numero5 = scanner.nextDouble();
        
        media = (numero1 + numero2 + numero3 + numero4 + numero5)/5;

        System.out.println("A sua media é: " + media);


        scanner.close();
    }
}