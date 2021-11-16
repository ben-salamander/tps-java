package TPSs_POO.TP_Validation.Classes.Abstract;

import TPSs_POO.TP_Validation.Interfaces.IMecanisme;

import java.time.Duration;

public abstract class Mecanisme extends Produit implements IMecanisme {
    //Attributs
    Duration heure;

    //Constructeurs
    public Mecanisme(String nom, double prix) {
        super(nom, prix);
    }

    public Mecanisme(String nom) {
        super(nom);
    }

    //Accesseurs
    public void setHeure(int heure, int minute) {
        this.heure = Duration.ofMinutes(minute + heure * 60L);
    }

    //toString
    @Override
    public String toString() {
        String result = super.toString();
        result = result.toLowerCase().replace("mec", "Mécanisme ");
        return result;
    }

    //Methodes
    public void affPrix() {
        System.out.printf("Prix : %.2f €\n", this.calculerPrix());
    }

    public void affCadran() {
        int h = (int) heure.toHours();
        int m = (int) heure.minusHours(h).toMinutes();
        System.out.printf("Le cadran indique : %dh%d\n", h, m);
    }

    public void affType() {
        System.out.printf("Mécanisme : %s\n", this.getClass().getSimpleName().substring(3));
    }

    public void affComplet() {
        System.out.printf("Détails de %s %s\n",
                this.getClass()
                        .getSimpleName()
                        .toLowerCase()
                        .replace("mec", "Mécanisme "),
                this.getNom());
        this.affType();
        this.affPrix();
        this.affCadran();
    }
}
