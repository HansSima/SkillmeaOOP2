public class Kocka extends Zvire {

    private int pocetSnezenychRyb;

    Kocka(int pocetNohou, String rasa, float hmotnost, int pocetSnezenychRyb) {
        this.pocetNohou = pocetNohou;
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.pocetSnezenychRyb = pocetSnezenychRyb;
    }

    public void udelejZvuk(){
        System.out.println("Mnau");
    }

}
