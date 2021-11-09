package TPSs_POO.TP5_Bibliotheque.classes;

public class Oeuvre {
    private final Auteur auteur;
    private String titre;
    private String langue = "francais";

    //Constructeurs
        public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.langue = langue;
        this.auteur = auteur;
    }

        public Oeuvre(String titre, Auteur auteur) {
        this.auteur = auteur;
        this.titre = titre;
    }

    //Méthodes
    public Auteur getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public String getLangue() {
        return langue;
    }

    public void afficher() {
        System.out.printf("%s, %s, en %s\n", this.titre, this.auteur.getNom(), this.langue);
    }
}
