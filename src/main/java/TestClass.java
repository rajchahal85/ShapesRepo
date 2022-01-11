public class TestClass {
    public static void main(String[] args) {
        Shape2D square = new Shape2D("red", new Dimension(4,4));
        System.out.println(square.getArea());

        Shape2D rect = new Shape2D("white", new Dimension(3,4,5));
        System.out.println(rect.getArea());

        Shape2D circle = new Shape2D("blue", new Dimension(5));
        System.out.println(circle.getArea());

        Shape3D cube = new Shape3D("black", new Dimension(4,4,4));
        System.out.println(cube.getVolume());
    }
}
