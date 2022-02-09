package classlab.solutions.week2;

public class Square extends Shape{
	public int side;
	
	public Square(String name, int side) {
		super(name);
		this.side = side;
	}
	
	public int area() {
		return side*side;
	}
	
	public String toString() {
		return name + " " + area();
	}
}
