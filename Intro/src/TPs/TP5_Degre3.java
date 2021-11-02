package TPs;

import java.util.Scanner;

public class TP5_Degre3 {
    public static void main(String[] args) {
        //Saisies
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez la valeur a : ");
        int a = keyboard.nextInt();
        System.out.print("Entrez la valeur b : ");
        int b = keyboard.nextInt();
        System.out.print("Entrez la valeur c : ");
        int c = keyboard.nextInt();
        System.out.print("Entrez la valeur x : ");
        double x = keyboard.nextDouble();

        //Calcul
        double result = ((float)(a+b)/2)*Math.pow(x,3) + Math.pow(a+b,2)*Math.pow(x,2) + a + b + c;

        //Affichage
        System.out.printf("Valeur du polynôme est : %f",result);
    }
}
