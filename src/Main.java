import java.util.*;

public class Main {
    public static void main(String[] args) {
        Joueur joueur = new Joueur();
        CarteDuJeu carteDuJeu = creerCarte(15);
        int nbTourDeJeu = 0;
    }

    public static CarteDuJeu creerCarte(int taille) {
        List<Case> l_cases = new ArrayList<>();

        for (int x = 0; x < taille; x++) {
            for (int y = 0; y < taille; y++) {

                int pick = new Random().nextInt(Ressource.values().length);
                TreeMap<Ressource, Integer> ressource = new TreeMap<>();
                ressource.put(Ressource.values()[pick], (int)(Math.random() * 25));

                l_cases.add(new Case(x, y, ressource));
            }
        }

        return new CarteDuJeu(taille, taille, l_cases);
    }
}
