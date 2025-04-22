import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class somaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int soma = 0;

        while (numero >= 0){

            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();

            if (numero < 0){
                break;
            }

            soma += numero;

        }

        System.out.println("A soma dos numeros é: " + soma);
        scanner.close();

    }
}