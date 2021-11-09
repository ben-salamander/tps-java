package TPSs_POO.TP7_AgenceVoyage.classes;

public abstract class OptionVoyage {
//    ATTRIBUTS
    private final String nom;
    final private double prix;

//    CONSTRUCTEUR
    public OptionVoyage(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

//    GET
    public String getNom() {
        return nom;
    }

    public abstract double prix();

//    METHODES
    //toString
    @Override
    public String toString() {
        return this.nom + " -> " + this.prix + "CHF";
    }
}
