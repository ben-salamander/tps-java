package TPSs_POO.TP6_GestionPersonnel.classes.Abstract;

import TPSs_POO.TP6_GestionPersonnel.classes.Profiles.Secretaire;

import java.time.YearMonth;

public abstract class Personne {
    //ATTRIBUTS
    private String nom;
    private int anneeArrivee;

    //CTOR
    public Personne(String nom, int anneeArrivee) {
        this.nom = nom;
        this.anneeArrivee = anneeArrivee;
    }

    public Personne(String nom) {
        this.nom = nom;
        this.anneeArrivee = YearMonth.now().getYear();
    }

    //Get
    public String getNom() {
        return nom;
    }

    public int getAnneeArrivee() {
        return anneeArrivee;
    }

    //Méthodes
    public boolean estEtudiant(){
        return false;
    }

    //toString
    @Override
    public String toString() {
        return "Nom : " + this.nom + '\n'
                + "Arrivé(e) : " + this.anneeArrivee + '\n';
    }
}
