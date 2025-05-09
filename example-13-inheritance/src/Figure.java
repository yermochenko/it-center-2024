abstract public class Figure {
	private final Point center;

	public Figure(Point center) {
		this.center = center;
	}

	public Point getCenter() {
		return center;
	}

	abstract public double perimeter();

	abstract public double area();
}
