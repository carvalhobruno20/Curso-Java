package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();

		System.out.printf("Area: %.2f%nPerimeter: %.2f%nDiagonal: %.2f%n", rectangle.area(), rectangle.perimeter(),
				rectangle.diagonal());

		sc.close();
	}

}
