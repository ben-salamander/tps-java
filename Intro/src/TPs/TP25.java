package TPs;

import java.util.ArrayList;

public class TP25 {
    public static void main(String[] args) {
        //Init
        ArrayList<String> listMails = new ArrayList<>();
        listMails.add("christian.lisangola@gmail.com");
        listMails.add("jean.paul@gmail.com");
        listMails.add("alain@gmail.com");
        listMails.add("lydie@yahoo.fr");
        listMails.add("josephine.lajoie@yahoo.com");
        listMails.add("luise@hotmail.fr");
        listMails.add("philemon.turion@gmail.com");
        listMails.add("jules.cesar@hotmail.fr");
        int nbYahoo = 0;
        int nbGmail = 0;
        int nbHotmail = 0;

        //Traitement
        nbYahoo = (int) listMails.stream().filter(mail -> mail.contains("yahoo.")).count();
        nbHotmail = (int) listMails.stream().filter(mail -> mail.contains("hotmail.")).count();
        nbGmail = (int) listMails.stream().filter(mail -> mail.contains("gmail.")).count();

        //Affichage
        System.out.printf("La liste des addresses mails contient %d%% de yahoo, %d%% de gmail et %d%% de hotmail.",
                nbYahoo *100 / listMails.size(),
                nbGmail *100/ listMails.size() ,
                nbHotmail *100/ listMails.size() );
    }
}
