package TPSs_POO.TP6_Philateliste.classes;

public class Commemoratif extends Timbre{
    //CONSTRUCTEURS
    public Commemoratif(String code, int anneeEmission, String paysOrigine, double valeurFaciale) {
        super(code, anneeEmission, paysOrigine, valeurFaciale);
    }

    public Commemoratif(String code, int anneeEmission, String paysOrigine) {
        super(code, anneeEmission, paysOrigine);
    }

    public Commemoratif(String code, int anneeEmission) {
        super(code, anneeEmission);
    }

    public Commemoratif(String code) {
        super(code);
    }

    public Commemoratif() {
    }

    //toStrong
    @Override
    public double vente() {
        return super.vente()*2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTimbre célébrant un évènement.";
    }
}
