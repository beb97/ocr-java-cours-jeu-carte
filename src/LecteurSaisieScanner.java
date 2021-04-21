import java.util.Scanner;

public class LecteurSaisieScanner implements LecteurSaisie{
    Scanner scanner;

    public LecteurSaisieScanner() {
        this.scanner = new Scanner( System.in );
    }

    @Override
    public String lire(String message) {
        System.out.println(message);
        String retour = scanner.nextLine();
        return retour;
    }

}
