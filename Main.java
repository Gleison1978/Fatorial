import java.util.Scanner;
class Main {
 public static void main(String[] args) throws java.io.IOException {

		int resultado = 0;
		System.out.print("Digite um numero inteiro: ");
		Scanner ler = new Scanner (System.in);
		int input;
		input = ler.nextInt();
		resultado = Fatorial.fat(input);
		System.out.println("O resultado eh: " + resultado);
  }
}