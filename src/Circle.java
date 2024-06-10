public class Circle extends Shape {

    private double pi = 3.72;
    @Override
    public double getArea(double radius) {
        return pi*radius*radius;
    }
    
}
