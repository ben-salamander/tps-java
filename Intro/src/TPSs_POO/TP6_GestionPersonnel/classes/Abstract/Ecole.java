package TPSs_POO.TP6_GestionPersonnel.classes.Abstract;

import TPSs_POO.TP6_GestionPersonnel.Enums.Sections;

public abstract class Ecole extends Personne{
    //ATTRIBUTS
    private Enum<Sections> nomSection;

    //CTOR
    public Ecole(String nom, int anneeArrivee, Enum<Sections> section) {
        super(nom, anneeArrivee);
        this.nomSection = section;
    }

    public Ecole(String nom, Enum<Sections> section) {
        super(nom);
        this.nomSection = section;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Section : " + this.nomSection + '\n';
    }
}