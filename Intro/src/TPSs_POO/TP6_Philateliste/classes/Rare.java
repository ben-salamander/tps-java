package TPSs_POO.TP6_Philateliste.classes;

public class Rare extends Timbre{
    //ATTRIBUTS
    private int nbExemplaires;

    //CONSTRUCTEURS
    public Rare(String code, int anneeEmission, String paysOrigine, double valeurFaciale, int nbExemplaires) {
        super(code, anneeEmission, paysOrigine, valeurFaciale);
        this.nbExemplaires = nbExemplaires;
    }

    public Rare(String code, int anneeEmission, String paysOrigine, int nbExemplaires) {
        super(code, anneeEmission, paysOrigine);
        this.nbExemplaires = nbExemplaires;
    }

    public Rare(String code, int anneeEmission, int nbExemplaires) {
        super(code, anneeEmission);
        this.nbExemplaires = nbExemplaires;
    }

    public Rare(String code, int nbExemplaires) {
        super(code);
        this.nbExemplaires = nbExemplaires;
    }

    public Rare(int nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }

    //Get
    public int getNbExemplaires() {
        return nbExemplaires;
    }

    //METHODES
    @Override
    public double vente() {
        int prixBase;
        if (nbExemplaires<100) prixBase=600;
        else if (nbExemplaires<=1000) prixBase=400;
        else prixBase = 50;

        return prixBase * (this.age()/10.0);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nNombre d'exemplaires : " + nbExemplaires;
    }
}
