package TPs;

import java.util.Scanner;

public class TP7 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez un nombre : ");
        int number = keyboard.nextInt();

        //Traitement
        boolean estPair = number%2 == 0;
        boolean estPositif = number >= 0;
        boolean estZeros = number == 0;

        //Affichage
        if (estZeros){
            System.out.print("Le nombre est zéro (et il est pair)");
        } else {
            System.out.printf("%d est %s et %s", number,estPair?"pair":"impair", estPositif?"positif":"négatif");
        }
    }
}
