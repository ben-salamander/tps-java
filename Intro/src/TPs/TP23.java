package TPs;

import java.util.ArrayList;
import java.util.Scanner;

public class TP23 {
    public static void main(String[] args) {
        //Init
        Scanner keyboard = new Scanner(System.in);
        String prog="dep";
        ArrayList<String> progLangue = new ArrayList<>();
        ArrayList<String> progLangueNotDesire = new ArrayList<>();

        //Saisie
        //Liste des prog
        while (true){
            System.out.print("\nSaisir un nouveau langage de programmation à ajouter à la liste : ");
            prog = keyboard.nextLine();
            if (prog.equals("")) break;
            progLangue.add(prog);
            System.out.print(progLangue);
        }

        //Liste des prog non désirés
        while (true){
            System.out.print("\nSaisir un langage de programmation à supprimer à la liste : ");
            prog = keyboard.nextLine();
            if (prog.equals("")) break;
            progLangueNotDesire.add(prog);
            System.out.print(progLangueNotDesire);
        }

        //Suppression des langages à enlever
        for (String programme:progLangueNotDesire) {
            while (progLangue.contains(programme)) progLangue.remove(programme);
        }
        System.out.print(progLangue);
    }
}
