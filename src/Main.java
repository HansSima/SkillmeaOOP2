import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random nahCislo = new Random();

        RodinnyDum dumNovaku = new RodinnyDum(4, "mramor", 457f);
        float cenaPrvnihoDomu = dumNovaku.vypocetCenyDomu(300, "Novakovi");

        RodinnyDum dumZajicu = new RodinnyDum(3, "drevo", 646f);
        float cenaDruhehoDomu = dumZajicu.vypocetCenyDomu(250, "Zajicovi");

        System.out.println(dumNovaku.getRozloha());

        System.out.println(cenaPrvnihoDomu + cenaDruhehoDomu);

    }
}