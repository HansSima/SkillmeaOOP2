public class Stavba {
    protected float rozloha;
    protected int pocetPoschodi;

    public float vypocetCenyDomu(int cenaZaMetr, String jmenoRodiny){
        float cena = rozloha * cenaZaMetr * pocetPoschodi;
        System.out.println(jmenoRodiny+ " " + cena);
        return cena;
    }


}
