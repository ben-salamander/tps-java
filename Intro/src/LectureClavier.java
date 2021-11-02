import java.util.Scanner;

class LectureClavier {
    public static void main(String[] args){
        //Saisies utilisateurs
        Scanner keyboard = new Scanner(System.in);
        String nom;
        System.out.print("Votre nom : ");
        nom = keyboard.nextLine();

        System.out.print("Votre age : ");
        int age = keyboard.nextInt();

        System.out.print("Votre genre : ");
        char genre = keyboard.next().charAt(0);

        //Formatage du titre
        String titre;
        if (genre == 'M' || genre =='m') {
            titre = "monsieur";
        } else {
            if (genre == 'F' || genre =='f'){
                titre = "madame";
            } else {
                titre = "";
            }
        }

        //Affichage
        if (age > 1)
        {
            System.out.printf("Bonjour %s %s, vous avez %d ans",titre, nom, age);
        } else {
            if (age == 1 || age == 0){
                System.out.printf("Bonjour %s %s, vous avez %d an",titre, nom, age);
            } else {
                System.out.print("Age incorrecte !");
            }
        }
    }
}
