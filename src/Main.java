import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RodinnyDum dumNovaku = new RodinnyDum(4, "mramor", 457f);
        float cenaPrvnihoDomu = dumNovaku.vypocetCenyDomu(300, "Novakovi");

        RodinnyDum dumZajicu = new RodinnyDum(3, "drevo", 646f);
        float cenaDruhehoDomu = dumZajicu.vypocetCenyDomu(250, "Zajicovi");

        System.out.println(cenaPrvnihoDomu + cenaDruhehoDomu);

        Obchod kaufland = new Obchod(2600f, 2, 25);
        kaufland.vypocetCenyObchodu();

        //Misto pro zverimex
        Pes alik = new Pes(4, "labrador", 15, 2);
        alik.udelejZvuk();

        Kocka micka = new Kocka(4, "Perska", 8, 20);
        micka.udelejZvuk();

        //Misto pro banku
        Banka mBank = new Banka(5, 1000f, 3.25f, 5f);
        System.out.println(mBank.vypocetSporicihoUctu());

    }
}