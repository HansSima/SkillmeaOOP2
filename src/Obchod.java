public class Obchod {
    private float rozloha;
    private int pocetPoschodi;
    private int pocetPokladen;

    Obchod(float rozloha, int pocetPoschodi, int pocetPokladen) {
        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladen = pocetPokladen;
    }

    public float vypocetCenyObchodu(){
        float cena = (rozloha * pocetPoschodi) + 5000 * pocetPokladen;
        System.out.println("Cena obchodu: " + cena);
        return cena;
    }



}
