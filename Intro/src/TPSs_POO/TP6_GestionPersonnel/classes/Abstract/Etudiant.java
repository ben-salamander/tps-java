package TPSs_POO.TP6_GestionPersonnel.classes.Abstract;

import TPSs_POO.TP6_GestionPersonnel.Enums.Sections;

public abstract class Etudiant extends Ecole{
    //CTOR
    public Etudiant(String nom, int anneeArrivee, Enum<Sections> section) {
        super(nom, anneeArrivee, section);
    }

    public Etudiant(String nom, Enum<Sections> section) {
        super(nom, section);
    }

    //Methode
    @Override
    public boolean estEtudiant() {
        return true;
    }
}
