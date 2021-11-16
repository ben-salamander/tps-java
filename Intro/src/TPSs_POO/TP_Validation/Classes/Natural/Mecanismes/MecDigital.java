package TPSs_POO.TP_Validation.Classes.Natural.Mecanismes;

import TPSs_POO.TP_Validation.Classes.Abstract.Mecanisme;
import TPSs_POO.TP_Validation.Interfaces.IMecDigital;

import java.time.Duration;

public class MecDigital extends Mecanisme implements IMecDigital {
    //   Constantes
    private static final double PRIX_BASE_DIGITAL = 35.12;
    Duration reveil;

    //   Constructeurs
    public MecDigital(String nom, double prix, int heure, int minute) {
        super(nom, prix);
        this.setReveil(heure, minute);
        this.setPrixBase(PRIX_BASE_DIGITAL);
    }

    public MecDigital(String nom, int heure, int minute) {
        super(nom);
        this.setReveil(heure, minute);
        this.setPrixBase(PRIX_BASE_DIGITAL);
    }

    //   Accesseurs
    public void setReveil(int heure, int minute) {
        this.reveil = Duration.ofMinutes(minute + heure * 60L);
    }

    //   Méthode mécanisme digital
    @Override
    public void affReveil() {
        int h = (int) reveil.toHours();
        int m = (int) reveil.minusHours(h).toMinutes();
        System.out.printf("Le reveil indique : %dh%d\n", h, m);
    }

    //   Affichage complet
    @Override
    public void affComplet() {
        super.affComplet();
        affReveil();
    }
}
