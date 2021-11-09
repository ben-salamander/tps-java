package TPSs_POO.TP5_Bibliotheque.classes;

import java.util.ArrayList;
import java.util.Objects;

public class Bibliotheque {
    //Attributs
    private String nom;
    private ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();

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
            if (Objects.equals(exemplaire.getOeuvre().getLangue(), langue)) {
                listExemplaire.add(exemplaire);
            }
        }
        return listExemplaire;
    }

    public ArrayList<Exemplaire> listerExemplaires() {
        return exemplaires;
    }

    public long compterExemplaire(Oeuvre oeuvre) {
        return exemplaires.stream().filter(ex -> Objects.equals(ex.getOeuvre(), oeuvre)).count();
    }

    public void afficherAuteur(boolean prime) {
        if (prime) {
            for (int i = 0; i < this.getNbExemplaires(); i++) {
                if (this.exemplaires.get(i).getOeuvre().getAuteur().isPrime()) {
                    System.out.printf("%s\n", this.exemplaires.get(i).getOeuvre().getAuteur().getNom());
                }
            }
        } else {
            for (int i = 0; i < this.getNbExemplaires(); i++) {
                System.out.printf("%s\n", this.exemplaires.get(i).getOeuvre().getAuteur().getNom());
            }
        }
    }

    public void afficherAuteur() {
        afficherAuteur(false);
    }
}
