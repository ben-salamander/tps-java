package TPSs_POO.TP7_AgenceVoyage.classes;

public class Transport extends OptionVoyage{
    //CONSTANTE
    final public double TARIF_LONG = 1500.0;
    final public double TARIF_BASE = 200.0;

    //ATTRIBUTS
    private boolean estLong = false;
    private double prixTransport;

    //CONSTRUCTEURS
    public Transport(String nom, double prix, boolean estLong) {
        super(nom, prix);
        this.estLong = estLong;
        this.prixTransport = (this.estLong ? TARIF_LONG : TARIF_BASE) + prix;
    }

    //METHODES
    @Override
    public double prix() {
        return prixTransport;
    }
}
