package TPSs_POO.TP_Validation.Classes.Natural.Mecanismes;

import TPSs_POO.TP_Validation.Classes.Abstract.Mecanisme;
import TPSs_POO.TP_Validation.Interfaces.IMecAnalogique;

public class MecAnalogique extends Mecanisme implements IMecAnalogique {
    //   Constantes
    private static final double PRIX_BASE_ANALOGIQUE = 56.42;
    int date;

    //   Constructeurs
    public MecAnalogique(String nom, double prix, int date) {
        super(nom, prix);
        this.date = date;
        this.setPrixBase(PRIX_BASE_ANALOGIQUE);
    }

    public MecAnalogique(String nom, int date) {
        super(nom);
        this.date = date;
        this.setPrixBase(PRIX_BASE_ANALOGIQUE);
    }

    //   Accesseurs
    public void setDate(int date) {
        this.date = date;
    }

    //   Méthodes mécanisme analogique
    @Override
    public void affDate() {
        System.out.printf("Affichage de la date : %d\n", date);
    }

    //   Affichage complet
    @Override
    public void affComplet() {
        super.affComplet();
        affDate();
    }
}
