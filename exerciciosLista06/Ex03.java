package exerciciosLista06;
import java.util.Scanner;
public class Ex03 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita os dois números ao usuário
	        System.out.print("Digite o primeiro número: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double num2 = scanner.nextDouble();

	        // Solicita a operação
	        System.out.print("Digite a operação (+, -, *, /): ");
	        char operacao = scanner.next().charAt(0);

	        double resultado;

	        // Verifica a operação e executa o cálculo
	        switch (operacao) {
	            case '+':
	                resultado = num1 + num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '-':
	                resultado = num1 - num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '*':
	                resultado = num1 * num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    resultado = num1 / num2;
	                    System.out.println("Resultado: " + resultado);
	                } else {
	                    System.out.println("Erro: divisão por zero.");
	                }
	                break;
	            default:
	                System.out.println("Operação inválida.");
	        }

	        scanner.close();
	    }
}
