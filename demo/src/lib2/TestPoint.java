package lib2;

import java.util.TreeSet;

class Point implements Comparable<Point>{
	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + "," + y;
	}

	@Override
	public int hashCode() {
		return x * y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public int compareTo(Point other) {
	       return this.x * this.y - other.x * other.y; 
	}

}

public class TestPoint {

	public static void main(String[] args) {
		 var points = new TreeSet<Point>();
		 
		 points.add(new Point(10,20));
		 points.add(new Point(20,20));
		 points.add(new Point(20,30));
		 points.add(new Point(10,20));
		 
		 for(var p : points) {
			 System.out.println(p.hashCode());
			 System.out.println(p);
		 }
	}
}

