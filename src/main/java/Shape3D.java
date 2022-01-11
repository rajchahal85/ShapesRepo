public class Shape3D implements   Shape {
    String color;
    Dimension dimensions;

    public Shape3D(String color, Dimension dimensions) {
        this.color = color;
        this.dimensions = dimensions;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume()
    {
        return dimensions.height * dimensions.width * dimensions.length;
    }
}
