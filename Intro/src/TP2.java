import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        //Saisies
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nom : ");
        String nom = keyboard.nextLine();
        System.out.print("Prénom : ");
        String prenom = keyboard.nextLine();
        System.out.print("Age : ");
        int age = keyboard.nextInt();

        //Affichage
        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans.",prenom,nom,age);
    }
}
