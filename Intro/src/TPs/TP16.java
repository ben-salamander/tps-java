package TPs;

import java.util.Scanner;

public class TP16 {
    public static void main(String[] args) {
        //SAISIES
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Saisissez la taille de votre tableau : ");
        int tabSize = keyboard.nextInt();
        int[] tab = new int[tabSize];
        for (int i=0; i<tabSize; i++) {
            System.out.printf("Tableau 1 [%d] : ",i);
            tab[i] = keyboard.nextInt();
        }

        //Traitement
        int min = 0;
        int max = 0;
        for (int e:tab) {
            if (e<min) min = e;
            if (e>max) max = e;
        }

        //Affichage
        System.out.printf("Tb : [%d",tab[0]);
        if (tab[0] == min){System.out.print("(PP)");}
        else if (tab[0] == max){System.out.print("(PG)");}
        for (int i = 1; i<tab.length; i++) {
            System.out.printf(", %d",tab[i]);
            if (tab[i] == min){System.out.print("(PP)");}
            else if (tab[i] == max){System.out.print("(PG)");}
        }
        System.out.printf("]\nPlus grand : %d\nPlus petit : %d",max,min);
    }
}
