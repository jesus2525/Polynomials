
public class MainClassTriangle {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3,5, 3,3, 3,3);
		
		System.out.println(triangle.Perimeter());
		triangle.print();
		System.out.println(triangle);
	}

}
