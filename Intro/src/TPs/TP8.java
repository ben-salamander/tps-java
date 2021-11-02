package TPs;

import java.util.Scanner;

public class TP8 {
    public static void main(String[] args) {
        //Saisies
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez la valeur a : ");
        int a = keyboard.nextInt();
        System.out.print("Entrez la valeur b : ");
        int b = keyboard.nextInt();
        System.out.print("Entrez la valeur c : ");
        int c = keyboard.nextInt();

        //Traitement et Affichage
        double discriminant = b*b - 4*a*c;
        if (discriminant > 0){
            double x1 = ((-1)*b-Math.sqrt(discriminant))/2*a;
            double x2 = ((-1)*b+Math.sqrt(discriminant))/2*a;
            System.out.printf("Les solutions de l'équation sont x1=%f et x2=%f",x1,x2);
        } else {
            if (discriminant == 0){
                double x = ((-1)*b)/2.0*a;
                System.out.printf("La solution de l'équation est x=%f",x);
            } else {
                System.out.print("Cette équation n'a pas de solution");
            }
        }
    }
}
