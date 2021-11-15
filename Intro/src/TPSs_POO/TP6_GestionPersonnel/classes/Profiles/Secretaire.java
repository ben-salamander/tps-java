package TPSs_POO.TP6_GestionPersonnel.classes.Profiles;

import TPSs_POO.TP6_GestionPersonnel.classes.Abstract.Personne;

public class Secretaire extends Personne {
    //ATTRIBUTS
    private String nomLabo;

    //CTOR
    public Secretaire(String nom, int anneeArrivee, String nomLabo) {
        super(nom, anneeArrivee);
        this.nomLabo = nomLabo;
    }

    public Secretaire(String nom, String nomLabo) {
        super(nom);
        this.nomLabo = nomLabo;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() + "Labo : " + this.nomLabo + '\n';
    }
}
