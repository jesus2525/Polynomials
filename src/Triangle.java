
public class Triangle {
	private Point v1;
	private Point v2;
	private Point v3;
	
	public Triangle(int x1, int y1, int x2 , int y2, int x3, int y3) {
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}
	public Triangle (Point p1, Point p2, Point p3) {
		v1 = p1;
		v2 = p2;
		v3 = p3;
	}
	public String toString () {
		return "'Triangle @ " + v1 + ", " + v2 + ", " + v3;
	}
	public double Perimeter () {
		return Point.getDistance(v1, v2) +  Point.getDistance(v2, v3) + Point.getDistance(v3, v1);
		
	}
	public void print() {
		double d1 =  Point.getDistance(v1, v2);
		double d2 = Point.getDistance(v2, v3);
		double d3 = Point.getDistance(v3, v1);
		
		if (d1  == d2 && d2 == d3 && d3 == d1) {
			System.out.println("This triangle is Equilateral");
		} else {
				
			if (d1 != d2 && d2 != d3 && d3 != d1) {
				System.out.println("This triangle is Scalene");
			} else {
				System.out.println("This triangle is Isosceles");
			}
		}
	}
}
