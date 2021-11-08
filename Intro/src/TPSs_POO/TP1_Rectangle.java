package TPSs_POO;

public class TP1_Rectangle {
    //Classes
    static class Rectangle {
        //Attributs
        private int longueur;
        private int largeur;

        //Get set Largeur
        public int getLargeur() {
            return largeur;
        }

        public void setLargeur(int largeur) {
            this.largeur = largeur;
        }

        //get set Longueur
        public int getLongueur() {
            return longueur;
        }

        public void setLongueur(int longueur) {
            this.longueur = longueur;
        }

        //Méthodes
        public int perimetre() {
            return (this.largeur + this.longueur) * 2;
        }

        public int aire() {
            return this.largeur * this.longueur;
        }
    }

    //MAIN
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLargeur(10);
        rectangle.setLongueur(25);

        System.out.printf("Pour un rectangle de largeur %d et longueur %d, le périmètre est de %d et l'aire est de %d",
                rectangle.largeur, rectangle.longueur, rectangle.perimetre(), rectangle.aire());
    }
}
