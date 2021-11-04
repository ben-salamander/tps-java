package TPs;

import java.util.Locale;
import java.util.Scanner;

public class TP21 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez une chaine à tester : ");
        String chaine = keyboard.nextLine();

        //Traitement
        for (int i = 0; i < chaine.length(); i++) {
            if ((i == 0)){
                chaine = chaine.substring(0,i) + chaine.substring(i,i+1).toUpperCase(Locale.ROOT) +chaine.substring(i+1);
            }else {
                if (chaine.charAt(i-1) == ' '){
                    chaine = chaine.substring(0,i) + chaine.substring(i,i+1).toUpperCase(Locale.ROOT) +chaine.substring(i+1);
                }
            }
        }

        //Affichage
        System.out.println(chaine);
    }
}
