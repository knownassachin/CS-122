package classlab.solutions.week2;

public class Rectangle extends Shape {
	public int side1;
	public int side2;
	
	public Rectangle(String name, int side1, int side2) {
		super(name);
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public int area() {
		return side1*side2;
	}
	
	public String toString() {
		return name + " " + area();
	}
}
