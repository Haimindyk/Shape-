public class Triangle extends Shape {

    double a;
    double b;
    double c;
    double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    void calcArea() {
        this.area = this.b*this.h/2;
    }

    @Override
    void calcHekef() {
        this.hekef = this.a+this.b+this.c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", h=" + h +
                ", area=" + area +
                ", hekef=" + hekef +
                '}';
    }
}
