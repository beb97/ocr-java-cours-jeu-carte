import java.util.ArrayList;

public interface JeuDeCartes {
    public ArrayList<Carte> getCartes();
    public void setCarte(Carte carte);
    public void genererCartes();
    public void melanger();
    public Carte piocher();
    public void recuperer(ArrayList<Carte> carte);
}
