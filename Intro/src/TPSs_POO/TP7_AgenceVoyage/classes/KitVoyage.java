package TPSs_POO.TP7_AgenceVoyage.classes;

import java.util.ArrayList;

public class KitVoyage {
    //ATTRIBUTS
    private final ArrayList<OptionVoyage> optionVoyages = new ArrayList<>();
    private final String depart;
    private final String destination;

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
        StringBuilder result = new StringBuilder("Voyage de " + this.depart + " à " + this.destination + ", avec pour option(s) :\n");
        for (OptionVoyage option : optionVoyages) {
            result.append(option.getNom()).append(" -> ").append(option.prix()).append(" CHF\n");
        }
        result.append("Prix total : ").append(this.prix());

        return result.toString();
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
