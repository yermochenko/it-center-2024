public class Circle extends Figure {
	private final double radius;

	public Circle(Point center, double radius) {
		super(center);
		if(radius <= 0) throw new IllegalArgumentException();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Круг {" +
				"центр: " + getCenter() +
				"; радиус: " + getRadius() +
				'}';
	}
}
