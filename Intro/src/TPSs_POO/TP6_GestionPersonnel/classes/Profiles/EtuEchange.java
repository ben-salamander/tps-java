package TPSs_POO.TP6_GestionPersonnel.classes.Profiles;

import TPSs_POO.TP6_GestionPersonnel.Enums.Sections;
import TPSs_POO.TP6_GestionPersonnel.classes.Abstract.Etudiant;

public class EtuEchange extends Etudiant {
    //ATTRIBUTS
    private String universiteOrigine;

    //CTOR
    public EtuEchange(String nom, int anneeArrivee, Enum<Sections> section, String universiteOrigine) {
        super(nom, anneeArrivee, section);
        this.universiteOrigine = universiteOrigine;
    }

    public EtuEchange(String nom, Enum<Sections> section, String universiteOrigine) {
        super(nom, section);
        this.universiteOrigine = universiteOrigine;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Université d'origine : " + this.universiteOrigine + '\n';
    }
}
