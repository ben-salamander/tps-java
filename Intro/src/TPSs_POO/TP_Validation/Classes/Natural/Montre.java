package TPSs_POO.TP_Validation.Classes.Natural;

import TPSs_POO.TP_Validation.Classes.Abstract.Mecanisme;
import TPSs_POO.TP_Validation.Classes.Abstract.Produit;

import java.util.ArrayList;

public class Montre extends Produit{
    //   Constantes
    private static final double PRIX_BASE_MONTRE = 2.20;

    //   Attributs
    private ArrayList<Produit> composants = new ArrayList<>();

    //   Constructeur
    public Montre(String nom, Boitier boitier, Bracelet bracelet, Fermoir fermoir, Vitre vitre, Mecanisme mecanisme) {
        super(nom);
        this.composants.add(mecanisme);
        this.composants.add(boitier);
        this.composants.add(bracelet);
        this.composants.add(fermoir);
        this.composants.add(vitre);

        double prix = 0;
        for (Produit composant : this.composants) {
            prix = prix + composant.calculerPrix();
        }
        this.setPrix(prix);

        this.setPrixBase(PRIX_BASE_MONTRE);
    }

    //   Accesseurs
    public Mecanisme getMecanisme() {
        return (Mecanisme) composants.get(0);
    }

    //   Méthodes
    public void affComposants() {
        System.out.printf("Composition de %s %s: \n",this.getClass().getSimpleName(),this.getNom());
        for (Produit composant : composants) {
            System.out.println(composant);
        }
    }
}
