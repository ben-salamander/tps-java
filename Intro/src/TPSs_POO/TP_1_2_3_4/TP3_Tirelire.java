package TPSs_POO.TP_1_2_3_4;

import java.util.Scanner;

public class TP3_Tirelire {
    //Classes
    static class Tirelire {
        //Attributs
        private double montant;

        //Construteur
        public Tirelire(double montant) {
            this.montant = montant;
        }

        //Get montant
        public double getMontant() {
            return montant;
        }

        //Méthodes
        public void afficher() {
            if (this.montant == 0) {
                System.out.println("Vous êtes sans sous");
            } else {
                System.out.printf("Vous aves %.2f€ dans votre tirelire.\n", this.montant);
            }
        }

        public void secouer() {
            if (this.montant > 0) {
                System.out.println("Bing bing");
            }
        }

        public void remplir(double montant) {
            this.montant += montant > 0 ? montant : 0;
        }

        public void vider() {
            this.montant = 0;
        }

        public void puiser(double montant) {
            if (montant > 0){
                this.montant = montant>=this.montant ? 0 : this.montant-montant;
            }
        }

        public double calculerSolde(double montant) {
            return this.montant <= montant ? this.montant : this.montant - montant;
        }
    }

    //MAIN
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double budgetVacance;

        Tirelire maTirelire = new Tirelire(0);
        maTirelire.afficher();
        maTirelire.afficher();
        maTirelire.remplir(550);
        maTirelire.secouer();
        maTirelire.afficher();
        maTirelire.puiser(15);
        maTirelire.afficher();

        System.out.print("Donner le budget de vos vancances : ");
        budgetVacance = keyboard.nextDouble();

        if (maTirelire.calculerSolde(budgetVacance) == maTirelire.getMontant()){
            System.out.printf("Il vous manque %.2f€ pour partir en vacances.\n", budgetVacance - maTirelire.getMontant());
        } else {
            System.out.printf("Vous êtes assez riche pour partir en vacances ! il vous restera %.2f euros à la rentrée\n",
                    maTirelire.calculerSolde(budgetVacance));
        }

    }
}
