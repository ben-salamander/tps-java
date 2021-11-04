package TPs;

import java.util.Scanner;

public class TP17 {
    public static void main(String[] args) {

        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez une chaine de caractère à renverser : ");
        String string = keyboard.nextLine();

        //Traitement
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            reverse.append(string.charAt(string.length() - i - 1));
        }

        //Affichage
        System.out.println(reverse);
    }
}
