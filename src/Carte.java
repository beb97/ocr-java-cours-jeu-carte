public class Carte implements Comparable<Carte> {
    CarteValeur valeur;
    CarteCouleur couleur;

    public Carte(CarteValeur valeur, CarteCouleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }


    @Override
    public int compareTo(Carte o) {
        if (valeur.ordinal() == o.valeur.ordinal()) {
            return couleur.ordinal() - o.couleur.ordinal();
        } else {
            return valeur.ordinal() - o.valeur.ordinal();
        }
    }

    @Override
    public String toString() {
        return valeur +" de " + couleur ;
    }
}
