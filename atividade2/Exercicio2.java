import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha a direção da conversão (Celsius para Fahrenheit - 'CF' ou Fahrenheit para Celsius - 'FC'): ");
        String direcao = scanner.next().toUpperCase();
        
        double temperatura;
        double resultado;

        if (direcao.equals("CF")) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = scanner.nextDouble();
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println("Temperatura em Fahrenheit: " + resultado + " °F");
        } else if (direcao.equals("FC")) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = scanner.nextDouble();
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println("Temperatura em Celsius: " + resultado + " °C");
        } else {
            System.out.println("Direção de conversão inválida.");
        }
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
