package tigadimensi;

import duadimensi.Lingkaran;

public class Kerucut extends Lingkaran {
    // Rumus V = 0.3 * phi * r * r * t
    final double sepertiga = 0.3;
    Double tinggi;

    public Kerucut(Double jari, Double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public Double volume() {
        return sepertiga * super.luas() * tinggi;
    }
}