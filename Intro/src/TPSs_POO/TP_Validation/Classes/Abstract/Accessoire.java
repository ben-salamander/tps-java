package TPSs_POO.TP_Validation.Classes.Abstract;

public abstract class Accessoire extends Produit{
    //Constructeurs
    public Accessoire(String nom, double prix) {
        super(nom, prix);
    }

    public Accessoire(String nom) {
        super(nom);
    }
}
