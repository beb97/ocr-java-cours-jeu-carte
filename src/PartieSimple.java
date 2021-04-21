import java.util.Comparator;

public class PartieSimple implements Partie {
    Equipe joueurs;
    JeuDeCartes cartes;
    LecteurSaisie lecteurSaisie;
    Integer tours = 0;

    public PartieSimple(Equipe joueurs, JeuDeCartes cartes, LecteurSaisie lecteurSaisie) {
        this.joueurs = joueurs;
        this.cartes = cartes;
        this.lecteurSaisie = lecteurSaisie;
    }

    public PartieSimple() {
        this(new Equipe(3), new JeuDeCarte54(), new LecteurSaisieScanner());
    }



    @Override
    public void demarrer() {
        // Melanger jeu de carte
        System.out.println("Début");
    }

    @Override
    public void jouerTour() {
        tours++;
        System.out.println("Partie "+tours+" "+cartes);
        // Mélanger jeu de carte
        cartes.melanger();
        // Piocher
        joueurs.getJoueurs().forEach((joueur) -> joueur.piocher(cartes.piocher()));
        System.out.println("pioche "+cartes);
        // Compararer
        joueurs.getJoueurs().sort(Comparator.reverseOrder());
        System.out.println("gagnant : "+joueurs.getJoueurs().get(0).getName());
        joueurs.getJoueurs().forEach((joueur) -> System.out.println(joueur));

        // Rendre les cartes
        joueurs.getJoueurs().forEach((joueur) -> {
            cartes.recuperer(joueur.rendre());
        });
        System.out.println("Rendre "+cartes);
        System.out.println("***");
    }

    @Override
    public void terminer() {
        // Afficher valeur
        System.out.println("Fin");
    }

    @Override
    public boolean estFinie() {

        String retour = lecteurSaisie.lire("Tappez 'c' pour continuer");
        return !retour.equals("c");
    }



}
