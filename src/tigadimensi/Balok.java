package tigadimensi;

import duadimensi.PersegiPanjang;

public class Balok extends PersegiPanjang {
    // Rumus V = panjang * lebar * tinggi
    Double tinggi;

    public Balok(Double panjang, Double lebar, Double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public Double volume() {
        return super.luas() * tinggi;
    }
}
