package TPs;

import java.util.Scanner;

public class TP19 {
    public static void main(String[] args) {
        //Init
        Scanner keyboard = new Scanner(System.in);
        String chaine;
        StringBuilder reverse = new StringBuilder();
        int num;
        boolean neg;

        //Saisie
        System.out.print("Saisir un nombre à inverser : ");
        num = keyboard.nextInt();

        //Traitement
        //Verif positivité
        neg = num < 0;
        num = num < 0 ? num * (-1): num;

        //Transo en chaine
        chaine = String.valueOf(num);

        //Reverse
        for (int i = 0; i < chaine.length(); i++) {
            reverse.append(chaine.charAt(chaine.length() - (i+1)));
        }

        //Affectation a num
        num = 0;
        for (int i = 0; i < reverse.length(); i++) {
            num = (int) (num + Character.getNumericValue(reverse.charAt(reverse.length()-(i+1))) *(Math.pow(10,i)));
        }
        num = neg ? num * (-1) : num;

        //Affichage
        System.out.println(num);
    }
}
