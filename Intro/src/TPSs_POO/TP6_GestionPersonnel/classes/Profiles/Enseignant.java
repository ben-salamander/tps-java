package TPSs_POO.TP6_GestionPersonnel.classes.Profiles;

import TPSs_POO.TP6_GestionPersonnel.Enums.Sections;
import TPSs_POO.TP6_GestionPersonnel.classes.Abstract.Ecole;

public class Enseignant extends Ecole {
    //ATTRIBUTS
    private int salaire;
    private String nomLabo;

    //CTOR
    public Enseignant(String nom, int anneeArrivee, Enum<Sections> section, int salaire, String nomLabo) {
        super(nom, anneeArrivee, section);
        this.salaire = salaire;
        this.nomLabo = nomLabo;
    }

    public Enseignant(String nom, Enum<Sections> section, int salaire, String nomLabo) {
        super(nom, section);
        this.salaire = salaire;
        this.nomLabo = nomLabo;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()
                + "Labo : " + this.nomLabo + '\n'
                + "Salaire : " + this.salaire + "€\n";
    }
}
