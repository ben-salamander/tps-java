package TPSs_POO.TP7_AgenceVoyage.classes;

public class Sejour extends OptionVoyage {
//    ATTRIBUTS
    private final double prixSejour;

//    CONSTRUCTEUR
    public Sejour(String nom, double prix, int nbNuits, double prixNuit) {
        super(nom, prix);
        this.prixSejour = nbNuits * prixNuit +prix;
    }

//    METHODES
    @Override
    public double prix() {
        return prixSejour;
    }
}
