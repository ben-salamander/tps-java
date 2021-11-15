package TPSs_POO.TP6_GestionPersonnel.classes;

import TPSs_POO.TP6_GestionPersonnel.classes.Abstract.Personne;

import java.util.HashMap;
import java.util.Objects;

public class Institution {
//    ATTRIBUTS
    private String nom;
    private HashMap<Integer, Personne> personnes = new HashMap<>();

//    GET
    public Institution(String nom) {
        this.nom = nom;
    }

    //    Methodes
    //Add
    public void addPersonne (Personne personne){
        personnes.put(personnes.size(), personne);
    }

    //Get
    public Personne getPersonne (String nom){
        for (int i = 0; i < personnes.size(); i++) {
            if (personnes.get(i).getNom().equals(nom)) return personnes.get(i);
        }
        return null;
    }

    public Personne getPersonne (int id){
        return personnes.get(id);
    }

    public int getNbPersonnes (){
        return personnes.size();
    }

    //Supp
    public void suppPersonne (int id){
        for (int i = id; i < personnes.size() ; i++) {
            if(personnes.containsKey(i+1)) personnes.replace(i,personnes.get(i+1));
        }
        personnes.remove(personnes.size()-1);
    }

    public void suppPersonne (String nom){
        for (int i = 0; i < personnes.size(); i++) {
            if (Objects.equals(personnes.get(i).getNom(), nom)){
                this.suppPersonne(i);
                return;
            }
        }
    }
}
