import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int operacao;
        float numero1;
        float numero2;
        float resultado=0;

        System.out.println("Digite o primero numero: ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = scanner.nextInt();

        System.out.println("Qual operação matematica voce quer? escolha o devido numero...1=+ 2=- 3=* 4=/");
        operacao = scanner.nextInt();
        if (operacao == 1) {
            resultado = numero1 + numero2;
        } else if (operacao == 2) {
            resultado = numero2 - numero1;
        } else if (operacao == 3) {
            resultado = numero1 * numero2;            
        } else if (operacao == 4){
            resultado = numero1 / numero2;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}