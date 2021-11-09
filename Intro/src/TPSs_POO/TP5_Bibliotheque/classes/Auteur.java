package TPSs_POO.TP5_Bibliotheque.classes;

public class Auteur {
    //Attributs
    private String nom;
    private boolean prime;

    //Constructeurs
    public Auteur(String nom, boolean prime) {
        this.nom = nom;
        this.prime = prime;
    }

    //Méthodes
    public String getNom() {
        return nom;
    }

    public boolean isPrime() {
        return prime;
    }
}
