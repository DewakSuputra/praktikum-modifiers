import duadimensi.Belahketupat;
import duadimensi.Jajargenjang;
import duadimensi.Lingkaran;
import duadimensi.Trapesium;
import duadimensi.Segitiga;
import duadimensi.Persegi;
import tigadimensi.Kerucut;
import tigadimensi.Balok;
import tigadimensi.LimasSegitiga;
public class App {
    public static void main(String[] args) throws Exception {

    Persegi pertama = new Persegi(10.0);
    System.out.println("Luasnya adalah: "+ pertama.luas());
    
    Belahketupat kedua = new Belahketupat(6.0, 5.0);
    System.out.println("Luasnya adalah = " + kedua.luas());

    Jajargenjang tiga = new Jajargenjang(5.0, 5.0);
    System.out.println("Luasnya adalah = " + tiga.luas());

    Lingkaran empat = new Lingkaran(5.0);
    System.out.println("Luasnya adalah = " + empat.luas());

    Trapesium lima = new Trapesium(3.0, 5.0, 4.5);
    System.out.println("Luasnya adalah = " + lima.luas());

    Segitiga tujuh= new Segitiga(3.0, 6.0);
    System.out.println("Luasnya adalah = " + tujuh.luas());

    Kerucut enam = new Kerucut(5.0, 3.0);
    System.out.println("Volumenya adalah = " + enam.volume());

    Balok delapan = new Balok(5.0, 6.0, 4.0);
    System.out.println("Volumenya adalah = " + delapan.volume());

    LimasSegitiga sembilan= new LimasSegitiga(4.0, 5.0, 8.0);
    System.out.println("Volumenya adalah = " + sembilan.volume());

    }
}
