package TPSs_POO.TP_Validation.Classes.Natural;

import TPSs_POO.TP_Validation.Classes.Abstract.Produit;

public class Boitier extends Produit {
    //   Constantes
    private static final double PRIX_BASE_BOITIER = 10.45;

    //   Constructeur
    public Boitier(String nom, double prix) {
        super(nom, prix);
        setPrixBase(PRIX_BASE_BOITIER);
    }

    public Boitier(String nom) {
        super(nom);
        setPrixBase(PRIX_BASE_BOITIER);
    }
}
