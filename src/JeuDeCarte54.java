import java.util.ArrayList;
import java.util.Collections;

public class JeuDeCarte54 implements JeuDeCartes{

    ArrayList<Carte> cartes;


    public JeuDeCarte54() {
        this.cartes = new ArrayList<Carte>();
        genererCartes();
    }

    @Override
    public ArrayList<Carte> getCartes() {
        return cartes;
    }

    @Override
    public void setCarte(Carte carte) {
        cartes.add(carte);
    }

    @Override
    public void genererCartes() {
        for (CarteCouleur couleur : CarteCouleur.values()) {
            for (CarteValeur valeur : CarteValeur.values()) {
                setCarte(new Carte(valeur, couleur));
            }
        }
    }

    @Override
    public void melanger() {
        Collections.shuffle(cartes);
    }

    @Override
    public Carte piocher() {
        return cartes.remove(0);
    }

    @Override
    public void recuperer(ArrayList<Carte> carte) {
        cartes.addAll(carte);
    }

    @Override
    public String toString() {
        return "("+ cartes.size()+" cartes)" ;
    }
}
