package TPSs_POO.TP5_Bibliotheque.classes;

public class Oeuvre {
    //CONSTANTES
    static String LANGUE_DEFAUT = "francais";

    //ATTRIBUTS
    private final Auteur auteur;
    private String titre;
    private String langue;

    //CONSTRUCTEUR
    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.langue = langue;
        this.auteur = auteur;
    }

    public Oeuvre(String titre, Auteur auteur) {
        this(titre, auteur, LANGUE_DEFAUT);
    }

    //METHODES
    //Get
    public Auteur getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public String getLangue() {
        return langue;
    }

    //Afficher
    public void afficher() {
        System.out.printf("%s, %s, en %s\n", this.titre, this.auteur.getNom(), this.langue);
    }
}
