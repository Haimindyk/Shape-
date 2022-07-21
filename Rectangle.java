public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void calcArea() {
        this.area=this.a*this.b;
    }

    @Override
    void calcHekef() {
        this.hekef = (this.a*2) +(this.b*2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + area +
                ", hekef=" + hekef +
                '}';
    }
}
