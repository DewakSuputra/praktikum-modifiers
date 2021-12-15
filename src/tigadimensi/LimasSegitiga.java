package tigadimensi;

import duadimensi.Segitiga;

public class LimasSegitiga extends Segitiga {
    double tinggiLimas;
    final double Sepertiga = 0.3;

    public LimasSegitiga(Double lebar, double tinggi, double tinggiLimas) {
        super(lebar, tinggi);
        this.tinggiLimas = tinggiLimas;
    }

    public Double volume() {
        return Sepertiga * super.luas() * tinggiLimas;
    }
}