package TPSs_POO.TP7_AgenceVoyage;

import TPSs_POO.TP7_AgenceVoyage.classes.*;

public class TP7_AgenceVoyage {
    public static void main(String[] args) {
        //Init
        KitVoyage monKit = new KitVoyage("Nantes", "Montréal");
        monKit.ajouterOption(new Transport("Vol Nantes-Paris", 50, false));
        monKit.ajouterOption(new Sejour("Hôtel Paris", 25, 1, 14.50));
        monKit.ajouterOption(new Transport("Vol Paris-Montréal", 150, true));

        //Affichage 1
        System.out.printf("Votre voyage est composé de %d option(s) :\n%s\n",monKit.getNbOptions(),monKit);

        //Reinitialisation à 0 des options
        monKit.vider();
        System.out.printf("Votre voyage est composé de %d option(s) :\n%s\n",monKit.getNbOptions(),monKit);

    }
}
