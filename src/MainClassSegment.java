
public class MainClassSegment {

	public static void main(String[] args) {
		Point p1 = new Point(4,6);
		Point p2 = new Point(6,8);
		
		
	
		Segment segment1 = new Segment(p1, p2);
		Segment segment2 = new Segment();
	
		segment1.setOffset(3, 4);
		System.out.println(segment1);
		System.out.println(segment1);
		
		/* Pont [] ps = new Point[4];
		   ps [0] = new Point (2,2); 
		   etc...
		   
		 */
		Point [] points = {new Point(2,2), new Point(2,4), new Point(4,4), new Point(4,2)};
		System.out.println(calculatePerimeter(points));
		
		Polygon pol = new Polygon(points);
		System.out.println(pol);

	}
	public static double calculatePerimeter (Point[] points) {
		double perimeter = 0;
		Segment segment;
		
		for (int i = 0; i < points.length - 1; i ++) {
			segment = new Segment(points[i], points [i+1]);
			perimeter = perimeter + segment.module();
		}	
		segment = new Segment (points[points.length-1], points [0]);
		perimeter = perimeter + segment.module();
		return perimeter;
	}
}
