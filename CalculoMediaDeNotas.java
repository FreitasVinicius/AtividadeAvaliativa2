import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculoMediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double soma = 0;
        int contador = 0;
        char resposta;

        do {
            System.out.println("Digite a nota de (O a 10):");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10){
                soma += nota;
                contador++;
            }else{
                System.out.println("Nota invalida!, Digite um valor de 0 a 10.");
            }

            System.out.println("Deseja imprimir outra nota ? (s/n): ");
            resposta = scanner.next().toLowerCase().charAt(0);

        }while(resposta == 's');

            if (contador > 0){
                double media = soma / contador;
                System.out.printf("A media das notas é: %.2f\n", media);
            }else{
                System.out.println("Nenhuma nota valida foi inserida.");
            }

            scanner.close();
        }

    }
