import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Exercicio Exemplo
//		System.out.print("Digite a largura: ");
//		double largura = sc.nextDouble();
//		System.out.print("Digite o comprimento: ");
//		double comprimento = sc.nextDouble();
//		System.out.print("Digite o preço: ");
//		double metroQuadrado = sc.nextDouble();
//		
//		double area = largura * comprimento;
//		double preco = area * metroQuadrado;
//		
//		System.out.printf("Area =  %.2f%n", area);
//		System.out.printf("Preço = %.2f%n", preco);

		// Exercicio 01

//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int soma = a + b;
//		
//		System.out.println("Soma = " + soma);

		// Exercicio 02

//		double raio = sc.nextDouble();
//		
//		double area = Math.PI * Math.pow(raio, 2.0);
//		
//		System.out.printf("Area = %.4f%n", area);

		// Exercicio 03

//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		
//		int diferenca = (a*b - c*d);
//		
//		System.out.println("DIFENÇA = " + diferenca);

		// Exercicio 04

//		int number = sc.nextInt();
//		double hours = sc.nextDouble();
//		double salaryHours = sc.nextDouble();
//		
//		double salary = hours * salaryHours;
//		
//		System.out.println("NUMBER: " + number);
//		System.out.printf("SALARY: U$ %.2f%n", salary);

		// Exercicio 05

//		int cod1, cod2, qtde1, qtde2;
//		double valor1, valor2, total;
//
//		cod1 = sc.nextInt();
//		qtde1 = sc.nextInt();
//		valor1 = sc.nextDouble();
//
//		cod2 = sc.nextInt();
//		qtde2 = sc.nextInt();
//		valor2 = sc.nextDouble();
//
//		total = qtde1 * valor1 + qtde2 * valor2;
//
//		System.out.printf("VALOR A PAGAR: %.2f%n", total);

		// Exercicio 05

		double a, b, c, pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double triangulo = (a * c) / 2.0;
		double circulo = pi * c * c;
		double trapezio = (a + b) / 2.0 * c;
		double quadrado = b * b;
		double retangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();

	}

}
