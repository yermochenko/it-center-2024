public class Point {
	private final double x;
	private final double y;

	public Point(double x, double y) {
		check(x);
		check(y);
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	private static void check(double coordinate) {
		if(Double.isNaN(coordinate) || Double.isInfinite(coordinate)) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String toString() {
		return "(" + getX() + "; " + getY() + ")";
	}
}
