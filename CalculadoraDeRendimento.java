import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculadoraDeRendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "sim";

        do {
            System.out.println("****CALCULADORA DE RENDIMENTO****");

            System.out.print("Digite o valor do investimento inicial(p):");
            double p = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual(r)");
            double r = scanner.nextDouble();

            System.out.print("Digite o periodo de Investimento em anos(t)");
            int t = scanner.nextInt();

            System.out.print("Escolha o tipo de capitalização (simples/composta)");
            scanner.nextLine();
            String tipoCapitalizacao = scanner.nextLine().toLowerCase();

            double M;

            if (tipoCapitalizacao.equals("simples")) {
                M = p * (1 + (r / 100) * t);
            } else if (tipoCapitalizacao.equals("composta")) {
                M = p * Math.pow((1 + (r / 100)), t);
            } else {
                System.out.println("Opção errada de capitalização, Tente novamente!");
                continue;
            }

            System.out.printf("O montante ao final do periodo: R$ %.2f%n", M);

            System.out.print("Deseja realizar outro cálculo? (sim/nao): ");
            continuar = scanner.nextLine().toLowerCase();

        } while(continuar.equals("sim"));

            System.out.println("Programa encerrado. Obrigado!");

            scanner.close();
            
    }
}