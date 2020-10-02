package principal;

import java.util.Locale;
import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Exercicio 01 Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
		// ímpares de 1 até X, um valor por linha, inclusive o
		// X, se for o caso.

//		int x = sc.nextInt();
//		
//		for(int i = 1; i < x; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}

		// Exercicio 02 Leia um valor inteiro N. Este valor será a quantidade de valores
		// inteiros X que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
		// estão fora do intervalo, mostrando
		// essas informações conforme exemplo (use a palavra "in" para dentro do
		// intervalo, e "out" para fora do intervalo).

//		int N = sc.nextInt();
//		int cont = 0;
//		int cont2 = 0;
//		for( int i = 0; i < N; i++) {
//			int x = sc.nextInt();
//			
//			if(x >= 10 && x <= 20) {
//				cont += 1;
//			}else {
//				cont2 += 1;	
//			}
//		}
//		
//		System.out.println(cont + " in");
//		System.out.println(cont2 + " out");

		// Exercicio 03 Leia 1 valor inteiro N, que representa o número de casos de
		// teste que vem a seguir. Cada caso de teste consiste
		// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
		// ponderada para cada um destes
		// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
		// valor tem peso 3 e o terceiro valor tem
		// peso 5.

//		int N = sc.nextInt();
//		
//
//		for(int i = 0; i < N; i++) {
//			double a = sc.nextDouble();
//			double b = sc.nextDouble();
//			double c = sc.nextDouble();
//			
//			double media = (a*2.00 + b*3.00 + c*5.00)/10.00;
//			
//			System.out.printf("%.1f%n", media);
//		}

		// Exercicio 04 Fazer um programa para ler um número N. Depois leia N pares de
		// números e mostre a divisão do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao
		// impossivel".

//		int N = sc.nextInt();
//		
//		for(int i = 0; i < N; i++) {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			
//			if(y == 0) {
//				System.out.println("Impossivel Calcular");
//			}else {
//				double div = (double) x / y;
//				System.out.printf("%.1f%n", div);
//			}
//		}

		// Exercicio 05 Ler um valor N. Calcular e escrever seu respectivo fatorial.
		// Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		// Lembrando que, por definição, fatorial de 0 é 1.

//		int n = sc.nextInt();
//
//		int fat = 1;
//
//		for (int i = 1; i <= n; i++) {
//			fat *= i;
//		}
//		System.out.println(fat);

		// Exercicio 06 Ler um número inteiro N e calcular todos os seus divisores.

//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++){
//			if(n % i == 0) {
//				System.out.println(i);
//			}
//		}

		// Exercicio 07 Fazer um programa para ler um número inteiro positivo N. O
		// programa deve então mostrar na tela N linhas,
		// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o
		// quadrado e o cubo do valor, conforme
		// exemplo.
		
		int N = sc.nextInt();
		
		for( int i = 1; i <= N; i++) {
			double quadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			System.out.printf("%d %.0f %.0f%n", i, quadrado, cubo);
		}
		
		sc.close();
	}
}
