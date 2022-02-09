package classSamples.inheritance.extraExamples;

public interface AcademicYearSpecifics {
	final int years  = 4;
	static int limit = 43;
	static int addAge(int age) {
		return age +=1;
	}
	String reverse(String s);
}

//public interface ShapeHelper{
//	double area();
//	double perimeter();
//	double volume();
//}
