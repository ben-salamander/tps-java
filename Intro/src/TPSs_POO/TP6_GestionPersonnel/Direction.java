package TPSs_POO.TP6_GestionPersonnel;

import TPSs_POO.TP6_GestionPersonnel.Enums.Sections;
import TPSs_POO.TP6_GestionPersonnel.classes.Institution;
import TPSs_POO.TP6_GestionPersonnel.classes.Profiles.Enseignant;
import TPSs_POO.TP6_GestionPersonnel.classes.Profiles.EtuEchange;
import TPSs_POO.TP6_GestionPersonnel.classes.Profiles.EtuRegulier;
import TPSs_POO.TP6_GestionPersonnel.classes.Profiles.Secretaire;

public class Direction {
    public static void main(String[] args) {
        //Init
        Institution clbit = new Institution("CLB Institut of Technologie");
        clbit.addPersonne(new Secretaire("Le Secrétaire", 1990,"Labo des dossiers"));
        clbit.addPersonne(new Enseignant("Madame la prof",1989, Sections.Physique,2400,"Labo des profs"));
        clbit.addPersonne((new EtuEchange("Jimmy Echangeur",2021,Sections.Technologie,"Une autre université")));
        clbit.addPersonne(new EtuRegulier("Josette Reguliere", 2019, Sections.Chimie,18.5));

        clbit.suppPersonne("Jimmy Echangeur");

        for (int i = 0; i < clbit.getNbPersonnes(); i++) {
            System.out.println(clbit.getPersonne(i).toString());
        }
    }
}
