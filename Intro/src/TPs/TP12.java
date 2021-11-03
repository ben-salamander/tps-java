package TPs;

import java.util.Objects;
import java.util.Scanner;

public class TP12 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez un email : ");
        String email = keyboard.nextLine();
        System.out.print("Saisissez un mot de passe : ");
        String mot2Passe = keyboard.nextLine();

        //Traitement
        System.out.print("Saisissez votre email : ");
        String emailCk = keyboard.nextLine();
        System.out.print("Saisissez votre mot de passe : ");
        String mot2PasseCk = keyboard.nextLine();

        while (!Objects.equals(email, emailCk) || !Objects.equals(mot2Passe, mot2PasseCk)){
            System.out.print("Saisies incorrectes\nSaisissez votre email : ");
            emailCk = keyboard.nextLine();
            System.out.print("Saisissez votre mot de passe : ");
            mot2PasseCk = keyboard.nextLine();
        }
        System.out.print("Bienvenu dans votre espace !");

    }
}
