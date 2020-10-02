package entities;

public class Rectangle {
	
	public Double width;
	public Double heigth;
	
	public double area() {
		return width * heigth;
	}
	
	public double perimeter() {
		return 2*(width + heigth);
	}
	
	public double diagonal() {
		return Math.sqrt(width*width + heigth*heigth);
	}
	
	
}
