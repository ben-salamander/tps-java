package TPs;

import java.util.Scanner;

public class TP30_CaractIdentiques {
    static boolean twoSameChar(String chaine){
        for (int i = 1; i < chaine.length(); i++) {
            if (chaine.charAt(i) == chaine.charAt(i-1)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisir une chaine à tester : ");
        String chaine = keyboard.nextLine();
        System.out.print(twoSameChar(chaine));
    }
}
