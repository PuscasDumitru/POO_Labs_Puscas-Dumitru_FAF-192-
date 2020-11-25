public class Square extends Figure
{
    private double area;
    private double side;
    private double perimeter;

    Square(double a)
    {
        this.side = a;
        this.area = this.side * this.side;
        this.perimeter = this.side * 4;
    }

    public double getArea()
    {
        return this.area;
    }

    public double getPerimeter()
    {
        return this.perimeter;
    }
}
