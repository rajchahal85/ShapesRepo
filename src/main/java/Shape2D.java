
public class Shape2D implements Shape {
    public double getArea()
    {
        if(dimensions.radius > 0)
        {
            return 3.14 * dimensions.radius * dimensions.radius;
        }
        else
        {
            return dimensions.height * dimensions.width;
        }
    }

    @Override
    public double getVolume() {
        return 0;
    }

    public Shape2D(String color, Dimension dimensions) {
        this.color = color;
        this.dimensions = dimensions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }



    String color;
    Dimension dimensions;
}
