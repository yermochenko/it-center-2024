public class Rectangle extends Figure {
	private final double width;
	private final double height;

	public Rectangle(Point center, double width, double height) {
		super(center);
		if(width <= 0 || height <= 0) throw new IllegalArgumentException();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double perimeter() {
		return 2 * (width + height);
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Прямоугольник {" +
				"центр: " + getCenter() +
				"; ширина: " + getWidth() +
				"; высота: " + getHeight() +
				'}';
	}
}
