
public class MainClass4 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle ();
		System.out.println(rectangle);
	
		rectangle.moveTo(4, 7);
		System.out.println(rectangle.toString());
		Point p = new Point(1,1);
		Rectangle rectangle1 = new Rectangle ();
		rectangle1 = new Rectangle(p, 8,6);
		System.out.println(rectangle1);
		Rectangle rectangle2;	
		rectangle2 =  new Rectangle(new Point(2,2), new Point(5,8));	
	
		System.out.println(rectangle2);
	}

}
