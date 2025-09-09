import java.util.Scanner;

public class CalculoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double soma = 0;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite a temperatura do dia %d: ", i + 1);
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];

            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
        }

        scanner.close();

        double media = soma / 7;
        
        System.out.printf("Média semanal: %.2f°C%n", media);
        System.out.printf("Maior temperatura: %.2f°C%n", maiorTemperatura);
        System.out.printf("Menor temperatura: %.2f°C%n", menorTemperatura);
    }
}