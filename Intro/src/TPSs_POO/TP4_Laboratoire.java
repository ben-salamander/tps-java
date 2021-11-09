package TPSs_POO;

public class TP4_Laboratoire {
    static class Souris{
        //Constantes
        final int ESPERANCE_VIE_DEFAUT = 36;

        //Attributs
        int poids;
        String couleur;
        int age = 0;
        int esperanceVie = ESPERANCE_VIE_DEFAUT;
        boolean clonee;

        //Constructeur
        public Souris(int poids, String couleur, int age, int esperanceVie) {
            this.poids = poids;
            this.couleur = couleur;
            this.age = age;
            this.esperanceVie = esperanceVie;
            System.out.println("Une nouvelle souris !");
        }

        public Souris(int poids, String couleur, int age) {
            this.poids = poids;
            this.couleur = couleur;
            this.age = age;
            System.out.println("Une nouvelle souris !");
        }

        public Souris(int poids, String couleur) {
            this.poids = poids;
            this.couleur = couleur;
            System.out.println("Une nouvelle souris !");
        }

        public Souris(Souris souris){
            this.poids = souris.poids;
            this.couleur = souris.couleur;
            this.age = souris.age;
            this.esperanceVie = souris.esperanceVie * 4/5;
            this.clonee = true;
            System.out.println("Clonage d'une souris !");
        }

        //Méthodes
        @Override
        public String toString() {
            return "Une souris "
                    +couleur
                    +(clonee ? ", clonée," : "")
                    +" de "
                    +age
                    +" mois et pesant "
                    +poids
                    +" grammes";
        }

        public void vieillir() {
            age++;
            couleur = (age>esperanceVie/2 && clonee) ? "verte" : couleur;
        }

        public void evolue() {
            while (age != esperanceVie) {
                vieillir();
            }
        }
    }

    //Main
    public static void main(String[] args) {
        Souris souris1 = new Souris(50, "blanche", 2);
        Souris souris2 = new Souris(45, "grise");
        Souris souris3 = new Souris(souris2);
        System.out.println(souris1);
        System.out.println(souris2);
        System.out.println(souris3);
        souris1.evolue();
        souris2.evolue();
        souris3.evolue();
        System.out.println(souris1);
        System.out.println(souris2);
        System.out.println(souris3);
    }
}
