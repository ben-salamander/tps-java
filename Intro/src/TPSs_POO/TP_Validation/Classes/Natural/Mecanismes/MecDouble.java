package TPSs_POO.TP_Validation.Classes.Natural.Mecanismes;

import TPSs_POO.TP_Validation.Classes.Abstract.Mecanisme;
import TPSs_POO.TP_Validation.Interfaces.IMecAnalogique;
import TPSs_POO.TP_Validation.Interfaces.IMecDigital;

import java.time.Duration;

public class MecDouble extends Mecanisme implements IMecDigital, IMecAnalogique {
    //   Constantes
    private static final double PRIX_BASE_DOUBLE = 74.32;
    Duration reveil;
    int date;

    //   Constructeur
    public MecDouble(String nom, double prix, int date, int heure, int minute) {
        super(nom, prix);
        this.date = date;
        this.setReveil(heure, minute);
        this.setPrixBase(PRIX_BASE_DOUBLE);
    }

    public MecDouble(String nom, int date, int heure, int minute) {
        super(nom);
        this.date = date;
        this.setReveil(heure, minute);
        this.setPrixBase(PRIX_BASE_DOUBLE);
    }

    //   Accesseurs
    public void setReveil(int heure, int minute) {
        this.reveil = Duration.ofMinutes(minute + heure * 60L);
    }

    public void setDate(int date) {
        this.date = date;
    }

    //   Méthode mécanisme double
    @Override
    public void affReveil() {
        int h = (int) reveil.toHours();
        int m = (int) reveil.minusHours(h).toMinutes();
        System.out.printf("Le reveil indique : %dh%d\n", h, m);
    }

    @Override
    public void affDate() {
        System.out.printf("Affichage de la date : %d\n", date);
    }

    //   Affichage complet
    @Override
    public void affComplet() {
        super.affComplet();
        affDate();
        affReveil();
    }
}
