package TPSs_POO.TP6_Philateliste.classes;

import java.time.YearMonth;

public class Timbre {
    //CONSTANTES
    private final int VALEUR_TIMBRE_DEFAUT = 1;
    private final String PAYS_DEFAUT = "France";
    private final int ANNEE_COURANTE = YearMonth.now().getYear();
    private final String CODE_DEFAUT = "lamba";

    //ATTRIBUTS
    private String code = CODE_DEFAUT;
    private int anneeEmission = ANNEE_COURANTE;
    private String paysOrigine = PAYS_DEFAUT;
    private double valeurFaciale = VALEUR_TIMBRE_DEFAUT;

    //CONSTRUCTEURS
    public Timbre(String code, int anneeEmission, String paysOrigine, double valeurFaciale) {
        this.code = code;
        this.anneeEmission = anneeEmission;
        this.paysOrigine = paysOrigine;
        this.valeurFaciale = valeurFaciale;
    }

    public Timbre(String code, int anneeEmission, String paysOrigine) {
        this.code = code;
        this.anneeEmission = anneeEmission;
        this.paysOrigine = paysOrigine;
    }

    public Timbre(String code, int anneeEmission) {
        this.code = code;
        this.anneeEmission = anneeEmission;
    }

    public Timbre(String code) {
        this.code = code;
    }

    public Timbre() {
    }

    //METHODES
    //Get
    public String getCode() {
        return code;
    }

    public int getAnneeEmission() {
        return anneeEmission;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    public double getValeurFaciale() {
        return valeurFaciale;
    }

    //Age/Vente/toStrong
    public int age() {
        return ANNEE_COURANTE - anneeEmission;
    }

    public double vente() {
        int ageTimbre = this.age();
        return ageTimbre < 5 ?
                this.valeurFaciale :
                this.valeurFaciale * ageTimbre * 2.5;
    }

    @Override
    public String toString() {
        return "Timbre de code '"+ code +"' datant de " + anneeEmission +
                " (" + paysOrigine + ')' +
                " ayant pour valeur faciale " + valeurFaciale +
                " francs";
    }
}