package TPSs_POO.TP5_Bibliotheque.classes;

import TPSs_POO.TP5_Bibliotheque.TP5_Bibliotheque;

public class Exemplaire {
    //Attribut
    private Oeuvre oeuvre;

    //Constructeurs
    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        System.out.printf("Nouvel exemplaire -> %s, %s, en %s\n",
                this.oeuvre.getTitre(),
                this.oeuvre.getAuteur().getNom(),
                this.oeuvre.getLangue());
    }

    public Exemplaire(Exemplaire exemplaire) {
        this.oeuvre = exemplaire.oeuvre;
        System.out.printf("Copie d'un exemplaire -> %s, %s, en %s\n",
                this.oeuvre.getTitre(),
                this.oeuvre.getAuteur().getNom(),
                this.oeuvre.getLangue());
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public void afficher() {
        System.out.printf("Un exemplaire de %s, %s, en %s\n",
                this.oeuvre.getTitre(),
                this.oeuvre.getAuteur().getNom(),
                this.oeuvre.getLangue());
    }
}
