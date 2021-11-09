package TPSs_POO.TP7_AgenceVoyage;

import TPSs_POO.TP7_AgenceVoyage.classes.KitVoyage;
import TPSs_POO.TP7_AgenceVoyage.classes.OptionVoyage;
import TPSs_POO.TP7_AgenceVoyage.classes.Sejour;
import TPSs_POO.TP7_AgenceVoyage.classes.Transport;

public class TP7_AgenceVoyage {
    public static void main(String[] args) {
        KitVoyage monKit = new KitVoyage("Nantes", "Montréal");
        monKit.ajouterOption(new Transport("Vol Nantes-Paris", 50, false));
        monKit.ajouterOption(new Sejour("Hôtel Paris", 25, 1, 14.50));
        monKit.ajouterOption(new Transport("Vol Paris-Montréal", 150, true));

        System.out.printf("Votre voyage est composé de %d option(s) :\n%s\n",monKit.getNbOptions(),monKit.toString());

        monKit.vider();

        System.out.printf("Votre voyage est composé de %d option(s) :\n%s\n",monKit.getNbOptions(),monKit.toString());

    }
}
