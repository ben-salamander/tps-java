package TPSs_POO.TP7_AgenceVoyage.classes;

import java.util.ArrayList;

public class KitVoyage {
    //ATTRIBUTS
    private ArrayList<OptionVoyage> optionVoyages = new ArrayList<>();
    private String depart;
    private String destination;

    //CONSTRUCTEUR
    public KitVoyage(String depart, String destination) {
        this.depart = depart;
        this.destination = destination;
    }

    //METHODES
    public double prix(){
        double prix = 0;
        for (OptionVoyage option : optionVoyages) {
            prix += option.prix();
        }
        return prix;
    }

    @Override
    public String toString() {
        String result = "Voyage de " + this.depart + " à " + this.destination + ", avec pour option(s) :\n";
        for (OptionVoyage option : optionVoyages) {
            result += option.getNom() + " -> " + option.prix() + " CHF\n";
        }
        result += "Prix total : " + this.prix();

        return result;
    }

    public void ajouterOption(OptionVoyage option) {
        if (option != null) {
            this.optionVoyages.add(option);
        }
    }

    public void vider() {
        this.optionVoyages.clear();
    }

    public int getNbOptions() {
        return this.optionVoyages.size();
    }
}
