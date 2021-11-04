package TPs;

import java.util.Locale;
import java.util.Scanner;

public class TP19 {
    public static void main(String[] args) {
        //Initialisations
        String chaineBase;
        String chaine;
        StringBuilder reverse;
        boolean estPalindrome;

        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez une chaine de caractère à vérifier (palindome) : ");
        chaineBase = keyboard.nextLine();
        chaine = chaineBase.toLowerCase(Locale.ROOT);

        //Traitement
        //Suppression des premiers espaces
        while (chaine.charAt(0) == ' '){
            chaine = chaine.substring(1);
        }
        //Suppression des espaces de fin
        while (chaine.charAt(chaine.length()-1) == ' '){
            chaine = chaine.substring(0,chaine.length()-1);
        }
        //Suppression des espaces dans la chaine
        for (int i = 0; i < chaine.length() ; i++) {
            while(chaine.charAt(i) == ' '){
                chaine = chaine.substring(0,i) + chaine.substring(i+1);
            }
        }
        //Inversement de la chaine et verif
        reverse = new StringBuilder();
        for (int i = 0; i < chaine.length(); i++) {
            reverse.append(chaine.charAt(chaine.length() - i - 1));
        }
        estPalindrome = reverse.toString().equals(chaine);

        //Affichage
        System.out.printf("%s %s",chaineBase,estPalindrome?"est un palindrome":"n'est pas un palindrome");
    }
}
