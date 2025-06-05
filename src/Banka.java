public class Banka {

    private int roky;
    private float pocatecniVklad;
    private float urokovaSazba;
    private float poplatky;
    private float konecnaCastka;

    Banka(int roky, float pocatecniVklad, float urokovaSazba, float poplatky) {
        this.roky = roky;
        this.pocatecniVklad = pocatecniVklad;
        this.urokovaSazba = urokovaSazba;
        this.poplatky = poplatky;
    }

    public float vypocetSporicihoUctu(){
        konecnaCastka = pocatecniVklad;

        for(int i = 0; i < roky; i++){
            konecnaCastka += konecnaCastka * (urokovaSazba/100) - poplatky;
        }

        return konecnaCastka;
    }


}
