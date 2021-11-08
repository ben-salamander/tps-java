package TPSs_POO;

public class TP2_IMC {
    //Classes
    static class Patient {
        //Attributs
        private double poids;
        private double taille;

        //Constructor
        public Patient(double poids, double taille) {
            this.poids = poids;
            this.taille = taille;
        }

        //Get poids
        public double getPoids() {
            return poids;
        }

        //Get taille
        public double getTaille() {
            return taille;
        }

        //Méthodes
        private double imc() {
            return this.poids / (Math.pow(this.taille, 2));
        }

        public void afficher() {
            System.out.printf("""
                    --------Patient----------
                    Poids : %.2f kg
                    Taille : %.2f cm
                    IMC : %f
                    -------------------------
                    """, this.poids, this.taille, this.imc());
        }
    }

    //MAIN
    public static void main(String[] args) {
        Patient patient = new Patient(78.5, 1.74);
        patient.afficher();
        System.out.printf("Poids du patient : %.2f kg\n", patient.getPoids());
        System.out.printf("Taille du patient : %.2f cm\n", patient.getTaille());
    }
}
