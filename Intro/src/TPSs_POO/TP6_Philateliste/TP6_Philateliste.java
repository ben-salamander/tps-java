package TPSs_POO.TP6_Philateliste;

import TPSs_POO.TP6_Philateliste.classes.*;

import java.time.Year;
import java.util.Date;
import java.util.Random;

public class TP6_Philateliste {
    //MAIN
    public static void main(String[] args) {
        //Init
        Timbre timbreGuarana = new Rare("Guarana-4574", 1960, "Mexique", 0.2, 98);
        Timbre timbre700eme = new Commemoratif("700eme-501", 2002, "Suisse", 1.5);
        Timbre timbreSetchuan = new Timbre("Setchuan-302", 2004, "Chine", 0.2);
        Timbre timbreYoddle = new Rare("Yoddle-201", 1916, "Suisse", 0.8, 3);

        //AFFICHAGE
        System.out.printf("%s\nPrix de vente : %f francs\n", timbreGuarana, timbreGuarana.vente());
        System.out.printf("%s\nPrix de vente : %f francs\n", timbre700eme, timbre700eme.vente());
        System.out.printf("%s\nPrix de vente : %f francs\n", timbreSetchuan, timbreSetchuan.vente());
        System.out.printf("%s\nPrix de vente : %f francs\n", timbreYoddle, timbreYoddle.vente());
    }

}
