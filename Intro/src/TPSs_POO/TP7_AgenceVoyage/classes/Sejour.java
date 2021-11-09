package TPSs_POO.TP7_AgenceVoyage.classes;

public class Sejour extends OptionVoyage {
    //ATTRIBUTS
    private int nbNuits;
    private double prixNuit;
    private double prixSejour;

    //CONSTRUCTEUR
    public Sejour(String nom, double prix, int nbNuits, double prixNuit) {
        super(nom, prix);
        this.nbNuits = nbNuits;
        this.prixNuit = prixNuit;
        this.prixSejour = this.nbNuits*this.prixNuit+prix;
    }

    //METHODES
    @Override
    public double prix() {
        return prixSejour;
    }
}
