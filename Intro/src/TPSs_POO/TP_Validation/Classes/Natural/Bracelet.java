package TPSs_POO.TP_Validation.Classes.Natural;

import TPSs_POO.TP_Validation.Classes.Abstract.Accessoire;

public class Bracelet extends Accessoire {
    //   Constantes
    private static final double PRIX_BASE_BRACELET = 8.90;

    //   Constructeur
    public Bracelet(String nom, double prix) {
        super(nom, prix);
        setPrixBase(PRIX_BASE_BRACELET);
    }

    public Bracelet(String nom) {
        super(nom);
        setPrixBase(PRIX_BASE_BRACELET);
    }
}
