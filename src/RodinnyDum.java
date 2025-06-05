public class RodinnyDum {
    private int pocetPoschodi;
    private String material;
    private float rozloha;
    private int pocetOken;

    RodinnyDum(int pocetPoschodi, String material, float rozloha) {
        this.pocetPoschodi = pocetPoschodi;
        this.material = material;
        this.rozloha = rozloha;
    }


    public float vypocetCenyDomu(int cenaZaMetr, String jmenoRodiny){
        float cena = rozloha * cenaZaMetr * pocetPoschodi;
        System.out.println(jmenoRodiny+ " " + cena);
        return cena;
    }


}
