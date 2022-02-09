package classlab.solutions.week2;

public class Shape {
	public String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public int area() {
		return 0;
	}
	
	public String toString() {
		return name + " " + area();
	}
}
