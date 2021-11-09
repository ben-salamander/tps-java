package TPSs_POO;

import java.util.ArrayList;
import java.util.Objects;

public class TP5_Bibliotheque {
    //CLASSES
    static class Auteur {
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

    static class Oeuvre {
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
            System.out.printf("%s, %s, en %s\n", this.titre, this.auteur.nom, this.langue);
        }
    }

    static class Exemplaire {
        //Attribut
        private Oeuvre oeuvre;

        //Constructeurs
        public Exemplaire(Oeuvre oeuvre) {
            this.oeuvre = oeuvre;
            System.out.printf("Nouvel exemplaire -> %s, %s, en %s\n",
                    this.oeuvre.titre,
                    this.oeuvre.auteur.nom,
                    this.oeuvre.langue);
        }

        public Exemplaire(Exemplaire exemplaire) {
            this.oeuvre = exemplaire.oeuvre;
            System.out.printf("Copie d'un exemplaire -> %s, %s, en %s\n",
                    this.oeuvre.titre,
                    this.oeuvre.auteur.nom,
                    this.oeuvre.langue);
        }

        public Oeuvre getOeuvre() {
            return oeuvre;
        }

        public void afficher() {
            System.out.printf("Un exemplaire de %s, %s, en %s\n",
                    this.oeuvre.titre,
                    this.oeuvre.auteur.nom,
                    this.oeuvre.langue);
        }
    }

    static class Bibliotheque {
        //Attributs
        String nom;
        ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();

        //Constructeurs
        public Bibliotheque(String nom) {
            this.nom = nom;
            System.out.printf("La bibliothèque %s est ouverte\n", this.nom);
        }

        public String getNom() {
            return nom;
        }

        public int getNbExemplaires() {
            return exemplaires.size();
        }

        public void stocker(Oeuvre oeuvre, int n) {
            for (int i = 0; i < n; i++) {
                this.exemplaires.add(new Exemplaire(oeuvre));
            }
        }

        public void stocker(Oeuvre oeuvre) {
            this.exemplaires.add(new Exemplaire(oeuvre));
        }

        public ArrayList<Exemplaire> listerExemplaires(String langue) {
            ArrayList<Exemplaire> listExemplaire = new ArrayList<>();
            for (Exemplaire exemplaire : this.exemplaires) {
                if (Objects.equals(exemplaire.oeuvre.langue, langue)) {
                    listExemplaire.add(exemplaire);
                }
            }
            return listExemplaire;
        }

        public ArrayList<Exemplaire> listerExemplaires() {
            return exemplaires;
        }

        public long compterExemplaire(Oeuvre oeuvre) {
            return exemplaires.stream().filter(ex -> Objects.equals(ex.oeuvre, oeuvre)).count();
        }

        public void afficherAuteur(boolean prime) {
            if (prime) {
                for (int i = 0; i < this.getNbExemplaires(); i++) {
                    if (this.exemplaires.get(i).oeuvre.auteur.prime) {
                        System.out.printf("%s\n", this.exemplaires.get(i).oeuvre.auteur.nom);
                    }
                }
            } else {
                for (int i = 0; i < this.getNbExemplaires(); i++) {
                    System.out.printf("%s\n", this.exemplaires.get(i).oeuvre.auteur.nom);
                }
            }
        }

        public void afficherAuteur() {
            afficherAuteur(false);
        }
    }

    //Main
    public static void main(String[] args) {
        //Init
        Bibliotheque bibliothequeMunicipale = new Bibliotheque("bibliothèque minicipale");
        bibliothequeMunicipale.stocker(
                new Oeuvre("Les Misérables", new Auteur("Victor Hugo", false)), 2);
        bibliothequeMunicipale.stocker(
                new Oeuvre("L'Homme qui rit", new Auteur("Victor Hugo", false)));
        bibliothequeMunicipale.stocker(
                new Oeuvre("Le Comte de Monte-Cristo", new Auteur("Alexandre Dumas", false)), 3);
        bibliothequeMunicipale.stocker(
                new Oeuvre("Zazie dans le metro", new Auteur("Raymond Queneau", true)));
        bibliothequeMunicipale.stocker(
                new Oeuvre("The count of Monte-Cristo",
                        new Auteur("Alexandre Dumas",
                                false), "anglais"), 1);

        //Affichages
        for (Exemplaire exemplaire : bibliothequeMunicipale.listerExemplaires()) {
            exemplaire.afficher();
        }

        System.out.println("Les exemplaires en anglais sont : ");
        for (Exemplaire exemplaire : bibliothequeMunicipale.listerExemplaires("anglais")) {
            exemplaire.afficher();
        }

        System.out.println("Les auteurs à succès sont : ");
        bibliothequeMunicipale.afficherAuteur(true);

        String oeuvreAChercher = "Le Comte de Monte-Cristo";
        if (
                bibliothequeMunicipale
                .exemplaires
                .stream()
                .anyMatch(ex -> Objects.equals(ex.oeuvre.titre, oeuvreAChercher))
        ) {
            System.out.printf("Il y a %d exemplaire(s) de %s",
                    bibliothequeMunicipale.compterExemplaire(
                            bibliothequeMunicipale
                                    .exemplaires
                                    .stream()
                                    .filter(ex -> Objects.equals(ex.oeuvre.titre, oeuvreAChercher))
                                    .findFirst()
                                    .get()
                                    .oeuvre),
                    oeuvreAChercher
            );
        } else {
            System.out.printf("Il n'y a pas d'exemplaire de %s", oeuvreAChercher);
        }
    }
}
