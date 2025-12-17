import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Peso(kg): ");
                double peso = sc.nextDouble();

                System.out.print("Altura(m): ");
                double altura = sc.nextDouble();

                double imc = peso / (altura * altura);

                System.out.printf("IMC: %2fn", imc);

                if (imc < 18.5) System.out.println("Abaixo do peso");

                else if (imc < 25) System.out.println("Peso Normal");
                else System.out.println("Sobrepeso");

    }
}