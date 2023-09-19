package week10.Shapes;

public class Square extends Rectangle{
    protected double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        this.height = width;
        this.side = width;
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        this.width = height;
        this.side = height;
    }
}
