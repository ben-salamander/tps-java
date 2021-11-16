package TPSs_POO.TP_Validation.Classes.Natural;

import TPSs_POO.TP_Validation.Classes.Abstract.Produit;

public class Fermoir extends Produit {
    //   Constantes
    private static final double PRIX_BASE_FERMOIR = 5.32;

    //   Constructeur
    public Fermoir(String nom, double prix) {
        super(nom, prix);
        setPrixBase(PRIX_BASE_FERMOIR);
    }

    public Fermoir(String nom) {
        super(nom);
        setPrixBase(PRIX_BASE_FERMOIR);
    }
}
