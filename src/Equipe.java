import java.util.ArrayList;
import java.util.List;

public class Equipe {

    ArrayList<Joueur> joueurs;

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public Equipe(Integer nombreDeJoueurs) {
        ArrayList<Joueur> nJoueurs = new ArrayList<Joueur>();
        for(int i = 0; i<nombreDeJoueurs; i++) {
            nJoueurs.add(new Joueur("Joueur"+i));
        }
        setJoueurs(nJoueurs);
    }

    public Equipe(List<String> noms) {
        ArrayList<Joueur> nJoueurs = new ArrayList<Joueur>();
        noms.forEach((nom) -> nJoueurs.add(new Joueur(nom)));
        setJoueurs(nJoueurs);
    }


}
