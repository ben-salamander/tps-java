package TPs;

import java.util.Scanner;

public class TP26_Prefixe {
    //Methodes
    static boolean isPrefixe (String mot, String prefixe){
        return mot.startsWith(prefixe);
    }

    //MAIN
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez un mot : ");
        String mot = keyboard.nextLine();
        System.out.println("Entrez un prefixe : ");
        String prefixe = keyboard.nextLine();

        System.out.printf("%s %s un prefixe de %s",prefixe,isPrefixe(mot,prefixe)?"est":"n'est pas",mot);
    }
}
