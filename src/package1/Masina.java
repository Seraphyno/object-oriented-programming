package package1;

public class Masina {
  //proprietatile/atributele/membrii pot fi vazuti si ca stari
  private static final int VITEZA_MAXIMA = 220; //constanta
  
  private String producator;
  private int nrRoti;
  private int vitezaCurenta = 0;
  
  public Masina(String producator, int nrRoti) {
    this.producator = producator;
    this.nrRoti = nrRoti;
  }
  
  public Masina(String producator) {
    this.producator = producator;
    this.nrRoti = 5;
  }
  
  //metodele pot fi vazute ca si comportamente
  
  public String getProducator() {
    return producator;
  }
  
  public void setProducator(String producator) {
    this.producator = producator;
  }
  
  public int getNrRoti() {
    return nrRoti;
  }
  
  public void setNrRoti(int nrRoti) {
    this.nrRoti = nrRoti;
  }
  
  public int getVitezaCurenta() {
    return vitezaCurenta;
  }
  
  public void accelereaza(int vitezaDorita) {
    if (vitezaDorita > VITEZA_MAXIMA || (vitezaCurenta + vitezaDorita > VITEZA_MAXIMA)) {
      accelereaza(VITEZA_MAXIMA);
    } else {
      while (vitezaDorita > vitezaCurenta) {
        if (vitezaCurenta % 5 == 0) {
          System.out.println("Viteza Curenta este: " + vitezaCurenta);
        }
        vitezaCurenta++; //acceleram gradual
      }
    }
  }
  
  public void franeaza(int vitezaDorita) {
    System.out.println("Soferul doreste sa incetineasca pana la: " + vitezaDorita);
    if (vitezaDorita <= 0) {
      opreste();
    } else {
      while (vitezaDorita < vitezaCurenta) {
        if (vitezaCurenta % 10 == 0) {
          System.out.println("Viteza Curenta este: " + vitezaCurenta);
        }
        vitezaCurenta--; //franam gradual
      }
    }
  }
  
  public void opreste() {
    System.out.println("Soferul doreste sa opreasca");
    while (vitezaCurenta > 0) {
      if (vitezaCurenta % 10 == 0) {
        System.out.println("Viteza Curenta este: " + vitezaCurenta);
      }
      vitezaCurenta--;
    }
  }
}
