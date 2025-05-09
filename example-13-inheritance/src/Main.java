import java.util.Locale;

public class Main {
	static void output(Figure figure) {
		System.out.println(figure);
		System.out.printf(Locale.US, "\tплощадь фигуры равна: %.4f\n", figure.area());
		System.out.printf(Locale.US, "\tпериметр фигуры равен: %.4f\n", figure.perimeter());
	}

	public static void main(String[] args) {
		Circle circle = new Circle(new Point(1, 2), 3);
		output(circle);
		Rectangle rectangle = new Rectangle(new Point(3, 4),5, 6);
		output(rectangle);
	}
}
