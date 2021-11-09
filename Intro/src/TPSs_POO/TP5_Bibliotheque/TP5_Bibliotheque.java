package TPSs_POO.TP5_Bibliotheque;

import TPSs_POO.TP5_Bibliotheque.classes.*;

import java.util.ArrayList;
import java.util.Objects;

public class TP5_Bibliotheque {
    //Main
    public static void main(String[] args) {
        //Init
        Bibliotheque bibliothequeMunicipale = new Bibliotheque("bibliothèque minicipale");
        bibliothequeMunicipale.stocker(
                new Oeuvre("Les Misérables", new Auteur("Victor Hugo", false)), 2);
        bibliothequeMunicipale.stocker(
                new Oeuvre("L'Homme qui rit", new Auteur("Victor Hugo", false)));
        bibliothequeMunicipale.stocker(
                new Oeuvre("Le Comte de Monte-Cristo", new Auteur("Alexandre Dumas", false)), 3);
        bibliothequeMunicipale.stocker(
                new Oeuvre("Zazie dans le metro", new Auteur("Raymond Queneau", true)));
        bibliothequeMunicipale.stocker(
                new Oeuvre("The count of Monte-Cristo",
                        new Auteur("Alexandre Dumas",
                                false), "anglais"), 1);

        //Affichages
        for (Exemplaire exemplaire : bibliothequeMunicipale.listerExemplaires()) {
            exemplaire.afficher();
        }

        System.out.println("Les exemplaires en anglais sont : ");
        for (Exemplaire exemplaire : bibliothequeMunicipale.listerExemplaires("anglais")) {
            exemplaire.afficher();
        }

        System.out.println("Les auteurs à succès sont : ");
        bibliothequeMunicipale.afficherAuteur(true);

        String oeuvreAChercher = "Le Comte de Monte-Cristo";
        if (
                bibliothequeMunicipale
                    .listerExemplaires()
                    .stream()
                    .anyMatch(ex -> Objects.equals(ex.getOeuvre().getTitre(), oeuvreAChercher))
        ) {
            System.out.printf("Il y a %d exemplaire(s) de %s",
                    bibliothequeMunicipale.compterExemplaire(
                            bibliothequeMunicipale
                                    .listerExemplaires()
                                    .stream()
                                    .filter(ex -> Objects.equals(ex.getOeuvre().getTitre(), oeuvreAChercher))
                                    .findFirst()
                                    .get()
                                    .getOeuvre()),
                    oeuvreAChercher
            );
        } else {
            System.out.printf("Il n'y a pas d'exemplaire de %s", oeuvreAChercher);
        }
    }
}
