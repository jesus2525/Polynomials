
public class MainClass3 {

	public static void main(String[] args) {
		Point p1 = new Point(4,5);
		Point p2 = new Point (6,8);
		Segment s1 = new Segment(p1,p2);
		s1.setOffset(4, 4);
		System.out.println(s1);
		System.out.println(s1.module());
		
	}

}
