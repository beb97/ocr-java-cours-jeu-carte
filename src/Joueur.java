import java.util.ArrayList;

public class Joueur implements Comparable<Joueur> {
    ArrayList<Carte> cartes;

    public String getName() {
        return name;
    }

    String name;

    public Joueur(String name) {
        this.name = name;
        this.cartes = new ArrayList<>();
    }

    public void piocher(Carte carte) {
        cartes.add(carte);
    }

    public ArrayList<Carte> rendre() {
        ArrayList<Carte> retour = new ArrayList<>();
        retour.addAll(cartes);

        this.cartes = new ArrayList<>();
        return retour;
    }

    @Override
    public int compareTo(Joueur o) {
        return cartes.get(0).compareTo(o.cartes.get(0));
    }

    @Override
    public String toString() {
        return name + " : " + cartes.get(0);
    }
}
