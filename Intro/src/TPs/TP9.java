package TPs;

import java.util.Scanner;

public class TP9 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez un numéro de moi : ");
        int moiNumero = keyboard.nextInt();

        //Traitement
        String moiLettre = switch (moiNumero) {
            case 1 -> "Janvier";
            case 2 -> "Février";
            case 3 -> "Mars";
            case 4 -> "Avril";
            case 5 -> "Mai";
            case 6 -> "Juin";
            case 7 -> "Juillet";
            case 8 -> "Août";
            case 9 -> "Septembre";
            case 10 -> "Octobre";
            case 11 -> "Novembre";
            case 12 -> "Décembre";
            default -> "Err";
        };

        //Affichage
        System.out.printf(moiLettre.equals("Err") ?
                "Ce numéro ne correspond à aucun moi":
                "%s",moiLettre);
    }
}
