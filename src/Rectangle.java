
public class Rectangle extends Point{

	private int width;
	private int height;
	
	public Rectangle() {
		super();
		width = 0;
		height = 0;
	}
	public String toString() {
		
		return  super.toString() +  " width: " + width + " height: " + height;
	}
	public Rectangle(Point p, int newWidth, int newHeight) {
		super(p.getX(), p.getY());;
		width = newWidth;
		height = newHeight;
	}
	public Rectangle (Point p1, Point p2) {
		super(p1.getX(), p1.getY());
		width = (p2.getX() - p1.getX());
		height = (p2.getY() - p1.getY());
	}
	public Rectangle (Segment seg) {
		int minX = seg.getStartPoint().getX();
		int minY = seg.getStartPoint().getY();
		if (seg.getEndPoint().getX() < minX) {
			minX= seg.getEndPoint().getX();
			
		}
		if (seg.getEndPoint().getY()< minY) {
			minY = seg.getEndPoint().getY();
		}
		setX(minX);
		setY(minY);
		width = Math.abs(seg.getEndPoint().getX() - seg.getStartPoint().getX());
		height = Math.abs(seg.getEndPoint().getY() - seg.getStartPoint().getY());
	}
	
	public double getArea() {
		return width * height;
	}
	public Point getPoint() {
		return new Point(getX(), getY());
	}
}
