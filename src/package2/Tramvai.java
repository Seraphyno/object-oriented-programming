package package2;

//Avem maxim 1 clasa publica per fisier, aceasta tb sa dea si numele fisierului
public class Tramvai {
  String identificator;
  int nrRoti;
  public static int counter = 0;
  
  /* Avem 3 constructori, dar doar unul este public (poate fi accesat din afara clasei)
   * Acesta apeleaza un constructor privat din clasa, care la randul lui apeleaza alt
   * construtor privat
   */
  public Tramvai() {
    new Tramvai("Craiova-20");
  }
  
  private Tramvai(String identificator) {
    new Tramvai(identificator, 20);
  }
  
  private Tramvai(String identificator, int nrRoti) {
    this.identificator = identificator;
    this.nrRoti = nrRoti;
    counter++;
  }
}

//putem avea oricate clase intr-un fisier, dar practica cea mai buna e sa cream cate un fisier pt fiecare clasa
class Tren {
  int nrVagoane;
  String tipLocomotiva;
  
  public Tren(int nrVagoane, String tipLocomotiva) {
    this.nrVagoane = nrVagoane;
    this.tipLocomotiva = tipLocomotiva;
  }
}
