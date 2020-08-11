public class Point{
	private final double x,y;

	public Point (double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	@Override
	public String toString(){
		return String.format("{%g, %g}",x,y);
	}

	public static void main(String args[]){
	Point p1 = new Point(2,1);
	Point p2 = new Point(2,1);
	Point p = new Point(2,1);
	//System.out.println( p1 == p2); false
	//System.out.println( p1.equals(p2)); false // true si p2=p1;
	//System.out.println((p1.getX()).equals(p2.getX()) && (p1.getY()).equals(p2.getY()));
	//no pueden ser derefenciados los double	
	//System.out.println(p1.getX() == p2.getX()); true
	//System.out.println(p instanceof Object); true
	//System.out.println(p); {2.00000,1.00000}
	
	//Point[] points = new Point[10];
	//for (Point point : points) {
	//	System.out.println(point.getX() + "," + point.getY());
	//}
	//System.out.println(p);  {2.00000,1.00000}
	}
}

	