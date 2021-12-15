package duadimensi;

public class Trapesium { 
    double a;
    double b;
    double t;
    final double seperdua = 0.5;

    public Trapesium(double atas, double bawah, double tinggi) {
        this.a = atas;
        this.b = bawah;
        this.t = tinggi;

    }

    public Double luas() {
        return seperdua * (a + b) * t;
    }
}
