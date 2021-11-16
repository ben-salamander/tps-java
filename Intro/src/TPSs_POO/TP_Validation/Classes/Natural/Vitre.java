package TPSs_POO.TP_Validation.Classes.Natural;

import TPSs_POO.TP_Validation.Classes.Abstract.Produit;

public class Vitre extends Produit {
    //   Constantes
    private static final double PRIX_BASE_VITRE = 20;

    //   Constructeur
    public Vitre(String nom, double prix) {
        super(nom, prix);
        setPrixBase(PRIX_BASE_VITRE);
    }

    public Vitre(String nom) {
        super(nom);
        setPrixBase(PRIX_BASE_VITRE);
    }
}
