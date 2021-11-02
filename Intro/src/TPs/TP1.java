package TPs;

import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisir un diamètre pour le calcul de l'air : ");
        int diametre = keyboard.nextInt();
        float surface = (float) (((diametre/2)*(diametre/2))*Math.PI);
        System.out.printf("La surface du cercle de diamètre %dcm est de %fcm².",diametre,surface);
    }
}
