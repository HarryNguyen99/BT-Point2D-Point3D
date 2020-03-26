public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.3f, 5.5f);
        System.out.println("point2D: " + point2D.toString());
        for (double values : point2D.getXY()) {
            System.out.print(values + "\t");
        }
    }
}
