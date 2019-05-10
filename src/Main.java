import package1.Masina;
import package2.Tramvai;

public class Main {
  
  public static void main(String[] args) {
    Masina audi = new Masina("Audi");
  
    System.out.println("Viteza Curenta este: " + audi.getVitezaCurenta());
    audi.accelereaza(300);
    System.out.println("Viteza Curenta este: " + audi.getVitezaCurenta());
    audi.franeaza(130);
    System.out.println("Viteza Curenta este: " + audi.getVitezaCurenta());
    audi.franeaza(0);
    System.out.println("Viteza Curenta este: " + audi.getVitezaCurenta());
  
    //in aceasta situatie e afla in afara pachetului care contine
    // clasa Bicicleta, deci aceasta nu este vizibila
    //Bicicleta bicicleta = new Bicicleta("rosu");
  
    System.out.println("Numar initial tramvaie: " + Tramvai.counter);
    Tramvai tramvai = new Tramvai();
    Tramvai tramvai2 = new Tramvai();
    Tramvai tramvai3 = new Tramvai();
    Tramvai tramvai4 = new Tramvai();
    System.out.println("Numar final tramvaie: " + Tramvai.counter);
  }
}
