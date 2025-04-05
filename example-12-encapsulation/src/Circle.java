public class Circle {
	private Point center;
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		if(newRadius >= 0) {
			radius = newRadius;
		} else {
			throw new IllegalArgumentException("Радиус должен быть положительным числом");
		}
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point newCenter) {
		center = newCenter;
	}

	public boolean isPointInside(Point p) {
		return Math.hypot(p.getX() - center.getX(), p.getY() - center.getY()) <= radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double length() {
		return 2 * Math.PI * radius;
	}
}
