package TPSs_POO.TP6_GestionPersonnel.classes.Profiles;

import TPSs_POO.TP6_GestionPersonnel.Enums.Sections;
import TPSs_POO.TP6_GestionPersonnel.classes.Abstract.Etudiant;

public class EtuRegulier extends Etudiant {
    //ATTRIBUT
    private double noteMoyenne;

    //CTOR
    public EtuRegulier(String nom, int anneeArrivee, Enum<Sections> section, double noteMoyenne) {
        super(nom, anneeArrivee, section);
        this.noteMoyenne = noteMoyenne;
    }

    public EtuRegulier(String nom, Enum<Sections> section, double noteMoyenne) {
        super(nom, section);
        this.noteMoyenne = noteMoyenne;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Note moyenne : " + this.noteMoyenne + '\n';
    }
}
