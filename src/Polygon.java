
public class Polygon {
	private Point[] points ;


	public Polygon(Point[] points) {
		this.points = points;
		
	}
	public Polygon () {
		points = null;
	
	}
	@Override
	public String toString() {
		String s  = "";
		for (Point p : points) {
			s = s + p.toString() + " - ";
		}
		s = s + points[0];
		return s; 
	}
	
	public double length() {
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
	public void SetOffSet(Point[] points) {
		for (int i = 0; i < points.length; i++) {
			//points[i] = SetOffSet(points[]);
		}
			
	}
}
