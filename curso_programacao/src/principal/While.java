package principal;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		int idade = sc.nextInt();
//		int soma = 0;
//		int cont = 0;
//
//		while (idade >= 0) {
//			soma = soma + idade;
//			cont = cont + 1;
//			idade = sc.nextInt();
//		}
//
//		if (cont > 0) {
//			double media = (double) soma / cont;
//			System.out.printf("%.2f%n", media);
//		} else {
//			System.out.println("impossivel calcular");
//		}

		// Exercicio 01 Escreva um programa que repita a leitura de uma senha até que
		// ela seja válida.
		// Para cada leitura de senha incorreta informada, escrever a mensagem "Senha
		// Invalida".
		// Quando a senha for informada corretamente deve ser impressa a mensagem
		// "Acesso Permitido"
		// e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

//		int senha;
//		
//		System.out.print("Digite a Senha:");
//		senha = sc.nextInt();
//		
//		while( senha != 2002) {
//			System.out.println("Senha Inválida");
//			senha = sc.nextInt();
//		}
//		System.out.println("Acesso Permitido!");

		// Exercicio 02 Escreva um programa para ler as coordenadas (X,Y) de uma
		// quantidade indeterminada de pontos no sistema
		// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
		// algoritmo será encerrado quando pelo
		// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		// alguma).

//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		while( x != 0 && y != 0 ) {
//			if( x>0 && y>0) {
//				System.out.println("Primeiro");
//			}else if (x>0 && y<0) {
//				System.out.println("Segundo");
//			}else if (x<0 && y<0) {
//				System.out.println("Terceiro");
//			}else{
//				System.out.println("Quarto");
//			}
//			x = sc.nextInt();
//			y = sc.nextInt();
//		}

		// Exercicio 03 Um Posto de combustíveis deseja determinar qual de seus produtos
		// tem a preferência de seus clientes. Escreva
		// um algoritmo para ler o tipo de combustível abastecido (codificado da
		// seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
		// deve ser solicitado um novo código (até
		// que seja válido). O programa será encerrado quando o código informado for o
		// número 4. Deve ser escrito a
		// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		// tipo de combustível, conforme
		// exemplo.
		
		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(x != 4) {
			if(x == 1) {
				alcool += 1;	
			}else if(x == 2) {
				gasolina += 1;	
			}else if(x == 3) {
				diesel += 1;
			}
			x = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado!!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
