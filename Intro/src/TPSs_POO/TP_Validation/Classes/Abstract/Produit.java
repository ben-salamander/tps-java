package TPSs_POO.TP_Validation.Classes.Abstract;

public abstract class Produit {
    //   Attributs
    private final String nom;
    private double prix;
    private double prixBase;

    //   Constructeur
    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Produit(String nom) {
        this.nom = nom;
        this.prix = 0;
    }

    //   Accesseurs
    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double newPrix) {
        prix = newPrix;
    }

    public void setPrixBase(double newPrix) {
        prixBase = newPrix;
    }

    //   toString
    @Override
    public String toString() {
        return String.format(" -%s %s\n   Prix : %.2f €",
                this.getClass().getSimpleName(),
                this.nom,
                this.calculerPrix());
    }

    //   Methodes
    public double calculerPrix() {
        return prixBase + this.prix;
    }
}
