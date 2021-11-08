package TPSs_POO;

public class TP2_IMC {
    //Classes
    static class Patient{
        //Attributs
        private double poids;
        private double taille;

        //Constructor
        public Patient(double poids, double taille){
            this.poids = poids;
            this.taille = taille;
        }

        //Get set poids
        public double getPoids() {
            return poids;
        }

        public void setPoids(double poids) {
            this.poids = poids;
        }

        //Get set taille
        public double getTaille() {
            return taille;
        }

        public void setTaille(double taille) {
            this.taille = taille;
        }

        //Méthodes
        public double imc(){
            return this.poids/(Math.pow(this.taille,2));
        }

        public void afficher(){
            System.out.printf("Poids du patient : %f",this.poids);
            System.out.printf("\nTaille du patient : %f",this.taille);
            System.out.printf("\nIMC du patient : %f",this.imc());
        }
    }

    //MAIN
    public static void main(String[] args) {
        Patient patient = new Patient(78.5,1.74);
        patient.afficher();
    }
}
