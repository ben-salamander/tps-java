package TPSs_POO.TP_Validation;

import TPSs_POO.TP_Validation.Classes.Abstract.Produit;
import TPSs_POO.TP_Validation.Classes.Natural.*;
import TPSs_POO.TP_Validation.Classes.Natural.Mecanismes.*;

public class Horlogerie {
    public static void main(String[] args) {
        //Init
        Montre maMontre = new Montre(
                "automne vintage",
                new Boitier("bois"),
                new Bracelet("cuir",2),
                new Fermoir("argent"),
                new Vitre("anti reflets"),
                new MecDouble("suisse",10,17,15));
        maMontre.getMecanisme().setHeure(17,26);

        //Affichage
        System.out.println("---------------");
        System.out.println(maMontre);
        System.out.println("---------------");
        maMontre.affComposants();
        System.out.println("---------------");
        maMontre.getMecanisme().affComplet();
    }
}
