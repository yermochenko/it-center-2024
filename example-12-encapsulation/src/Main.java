public class Main {
	public static void main(String[] args) {
		double totalArea = 0;
		double totalLength = 0;
		Circle bigBall = new Circle();
		bigBall.setRadius(50);
		bigBall.setCenter(new Point());
		bigBall.getCenter().setX(100);
		bigBall.getCenter().setY(60);
		totalArea += bigBall.area();
		totalLength += bigBall.length();
		Circle mediumBall = new Circle();
		mediumBall.setRadius(30);
		mediumBall.setCenter(new Point());
		mediumBall.getCenter().setX(100);
		mediumBall.getCenter().setY(140);
		totalArea += mediumBall.area();
		totalLength += mediumBall.length();
		Circle smallBall = new Circle();
		smallBall.setRadius(20);
		smallBall.setCenter(new Point());
		smallBall.getCenter().setX(100);
		smallBall.getCenter().setY(190);
		totalArea += smallBall.area();
		totalLength += smallBall.length();
		System.out.println(totalArea);
		System.out.println(totalLength);
	}
}
