public class Dimension {
    int height;
    int width;
    int length;
    int radius;

    public Dimension(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Dimension(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Dimension(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getVolume()
        {
            return 0;

        }

}
