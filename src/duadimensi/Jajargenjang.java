package duadimensi;

public class Jajargenjang {
    Double a;
    Double t;

    public Jajargenjang(Double inputAlas, Double inputTinggi) {
        this.a = inputAlas;
        this.t = inputTinggi;
    }

    public Double luas(){
        return a * t;
    }
}
