package exerciciosLista06;
import java.util.Scanner;
public class Ex06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita os lados ao usuário
	        System.out.print("Digite o comprimento do primeiro lado: ");
	        double lado1 = scanner.nextDouble();

	        System.out.print("Digite o comprimento do segundo lado: ");
	        double lado2 = scanner.nextDouble();

	        System.out.print("Digite o comprimento do terceiro lado: ");
	        double lado3 = scanner.nextDouble();

	        // Verifica se é um triângulo válido (regra da desigualdade triangular)
	        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	            if (lado1 == lado2 && lado2 == lado3) {
	                System.out.println("Triângulo Equilátero");
	            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	                System.out.println("Triângulo Isósceles");
	            } else {
	                System.out.println("Triângulo Escaleno");
	            }
	        } else {
	            System.out.println("Os valores fornecidos não formam um triângulo válido.");
	        }

	        scanner.close();
	    }
}
