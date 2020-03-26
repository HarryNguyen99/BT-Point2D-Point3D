public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(6.5f, 4.4f, 5.5f);
        System.out.println("Point3D: " + point3D.toString());
        for (double values : point3D.getXYZ()) {
            System.out.print(values + "\t");
        }
    }
}
