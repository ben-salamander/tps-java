package TPs;

import java.util.Objects;
import java.util.Scanner;

public class TP13 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez un email : ");
        String email = keyboard.nextLine();
        System.out.print("Saisissez un mot de passe : ");
        String mot2Passe = keyboard.nextLine();
        int nbTentative = 0;
        int nbTentativeRestant = 5;

        //Traitement
        System.out.print("Saisissez votre email : ");
        String emailCk = keyboard.nextLine();
        System.out.print("Saisissez votre mot de passe : ");
        String mot2PasseCk = keyboard.nextLine();
        nbTentative++;
        nbTentativeRestant--;

        //Erreure de saisie utilisateur
        while ((!Objects.equals(email, emailCk) || !Objects.equals(mot2Passe, mot2PasseCk)) && nbTentativeRestant > 0){
            System.out.printf("Saisie incorrecte, vous avez encore %d essais.\nSaisissez votre email : ",nbTentativeRestant);
            emailCk = keyboard.nextLine();
            System.out.print("Saisissez votre mot de passe : ");
            mot2PasseCk = keyboard.nextLine();
            nbTentative++;
            nbTentativeRestant--;
        }

        //Affichage
        System.out.printf("%s",
                nbTentativeRestant == 0 && (!Objects.equals(email, emailCk) || !Objects.equals(mot2Passe, mot2PasseCk)) ?
                        "Compte bloqué":"Bienvenu dans votre espace !");
    }
}
