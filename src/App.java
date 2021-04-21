import java.util.Arrays;

public class App {

    public static void main(String[]args){

        JeuDeCartes jeuDeCartes = new JeuDeCarte54();

        String[] noms = {"Pierre", "Mumu", "Rati"};
        Equipe joueurs = new Equipe(Arrays.asList( noms ));
        LecteurSaisie lecteurSaisie = new LecteurSaisieScanner();

        Partie partie = new PartieSimple(joueurs, jeuDeCartes, lecteurSaisie);

        partie.demarrer();
        do {
            partie.jouerTour();
        } while (!partie.estFinie());
        partie.terminer();
    }

}