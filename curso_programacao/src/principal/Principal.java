package principal;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Exercicio 01 Fazer um programa para ler um número inteiro, e depois dizer se
		// este número é negativo ou não.

//		int x;
//		
//		System.out.print("Digite um Numero: ");
//		x = sc.nextInt();
//		
//		if( x < 0) {
//			System.out.println("Numero é Negativo!");
//		}else {
//			System.out.println("Não é Negativo!");
//		}

		// Exercicio 02 Fazer um programa para ler um número inteiro e dizer se este
		// número é par ou ímpar.

//		System.out.print("Digite um Numero: ");
//		int x = sc.nextInt();
//		
//		if(x % 2 == 0) {
//			System.out.println("PAR!");
//		}else {
//			System.out.println("ÍMPAR!");
//		}

		// Exercicio 03 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
		// uma mensagem "Sao Multiplos" ou "Nao sao
		// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
		// números devem poder ser digitados em
		// ordem crescente ou decrescente.

//		int A = sc.nextInt();
//		int B = sc.nextInt();
//
//		if (A % B == 0 || B % A == 0) {
//			System.out.println("São multiplos");
//		} else {
//			System.out.println("Não são multiplos");
//		}

		// Exercicio 04 Leia a hora inicial e a hora final de um jogo. A seguir calcule
		// a duração do jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
		// máxima de 24 horas.

//		int horaInicial = sc.nextInt();
//		int horaFinal = sc.nextInt();
//		int duracao;
//
//		if (horaInicial < horaFinal) {
//			duracao = horaFinal - horaInicial;
//		} else {
//			duracao = 24 - horaInicial + horaFinal;
//		}
//
//		System.out.println("O JOGO DUROU " + duracao + " HORAS(S)");

		// Exercicio 05

//		int codigo = sc.nextInt();
//		int quantidade = sc.nextInt();
//		double total;
//
//		if (codigo == 1) {
//			total = quantidade * 4.00;
//		} else if (codigo == 2) {
//			total = quantidade * 4.50;
//		} else if (codigo == 3) {
//			total = quantidade * 5.00;
//		} else if (codigo == 4) {
//			total = quantidade * 2.00;
//		} else {
//			total = quantidade * 1.50;
//		}
//
//		System.out.printf("Total: R$ %.2f%n", total);

		// Exercicio 06 Você deve fazer um programa que leia um valor qualquer e
		// apresente uma mensagem dizendo em qual dos
		// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se
		// encontra. Obviamente se o valor não estiver em
		// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
//
//		double valor = sc.nextDouble();
//
//		if (valor < 0.0 || valor > 100.00) {
//			System.out.println("Fora do intervalo");
//		} else if (valor <= 25.00) {
//			System.out.println("Intervalo [0,25]");
//		} else if (valor <= 50.00) {
//			System.out.println("Intervalo [25,50]");
//		} else if (valor <= 75.00) {
//			System.out.println("Intervalho [50,75]");
//		} else {
//			System.out.println("Intervalo [75,100]");
//		}

		// Exercicio 07

//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//
//		if (x == 0.0 && y == 0.0) {
//			System.out.println("Origem");
//		} else if (x == 0.0) {
//			System.out.println("Eixo Y");
//		} else if (y == 0.0) {
//			System.out.println("Eixo X");
//		} else if (x > 0.0 && y > 0.0) {
//			System.out.println("Q1");
//		} else if (x < 0.0 && y > 0.0) {
//			System.out.println("Q2");
//		} else if (x < 0.0 && y < 0.0) {
//			System.out.println("Q3");
//		} else {
//			System.out.println("Q4");
//		}

		// Exercicio 08

//		double salario = sc.nextDouble();
//		double imposto;
//
//		if (salario <= 2000.0) {
//			imposto = 0.0;
//		} else if (salario <= 3000.00) {
//			imposto = (salario - 2000.0) * 0.08;
//		} else if (salario <= 4500.0) {
//			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
//		} else {
//			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//		}
//		if (imposto == 0.0) {
//			System.out.println("isento");
//		} else {
//			System.out.printf("R$ %.2f%n", imposto);
//		}

		
		sc.close();
	}

}
