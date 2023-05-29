import java.util.*;

public class Main {
    private static Joueur joueur;
    private static CarteDuJeu carteDuJeu;
    private static int nbTourDeJeu;

    public static void main(String[] args) {
        initJeu();

        while (!finDuJeu()) {
            tourDeJeu();
        }
    }

    private static void initJeu() {
        joueur = new Joueur(50);
        carteDuJeu = creerCarte(15);
        nbTourDeJeu = 0;
    }

    private static void tourDeJeu() {
        nbTourDeJeu++;

        productionBatiment();
        recolteUnite();
        // fonction pour le déplacement des unités

        creerUnite();
        creerBatiment();

        detruireUnite();
        detruireBatiment();
    }

    private static boolean finDuJeu() {
        return false;
    }

    private static CarteDuJeu creerCarte(int taille) {
        ArrayList<Case> l_cases = new ArrayList<>();

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

    private static void productionBatiment() {
        for (BatimentProduction batiment : joueur.getBatimentsProduction()) {
            batiment.produire(joueur);
        }

        for (BatimentOutil batiment : joueur.getBatimentsOutil()) {
            batiment.produire(joueur);
        }
    }

    private static void recolteUnite() {
        for (Unite unite : joueur.getUnites()) {
            unite.recolter(joueur, getCaseDeUnite(unite));
        }
    }

    private static Case getCaseDeUnite(Unite unite) {
        for (Case aCase : carteDuJeu.getCases()) {
            if (aCase.getPositionX() == unite.positionX && aCase.getPositionY() == unite.positionY) {
                return aCase;
            }
        }
        return null;
    }
    
    private static void creerUnite() {
        Scanner scanner = new Scanner(System.in);
        String reponse = "";

        while(!reponse.equals("O") && !reponse.equals("N")) {
            System.out.println("Voulez-vous créer une unité ? (O = oui; N = non)");
            System.out.flush();
            reponse = scanner.nextLine();
        }

        creerTypeUnite(scanner, reponse);
    }

    private static void creerTypeUnite(Scanner scanner, String reponse) {
        if (reponse.equals("O")) {
            while(!reponse.equals("B") && !reponse.equals("M") && !reponse.equals("P")) {
                System.out.println("Quelle type d'unité voulez-vous créer ? (B = bucheron; M = mineur; P = Paysan)");
                System.out.flush();
                reponse = scanner.nextLine();
            }

            // création de l'unité
        }
    }

    private static void creerBatiment() {
        Scanner scanner = new Scanner(System.in);
        String reponse = "";

        while(!reponse.equals("O") && !reponse.equals("N")) {
            System.out.println("Voulez-vous créer un batiment ? (O = oui; N = non)");
            System.out.flush();
            reponse = scanner.nextLine();
        }

        creerTypeBatiment(scanner, reponse);
    }

    private static void creerTypeBatiment(Scanner scanner, String reponse) {
        if (reponse.equals("O")) {
            while(!reponse.contains("B") && !reponse.contains("M") && !reponse.contains("P")) {
                System.out.println("Quelle type d'unité voulez-vous créer ? (UB = unité bucheron; UM = unité mineur; UP = unité Paysan; OB = outil bucheron; OM = outil mineur; OP = outil Paysan)");
                System.out.flush();
                reponse = scanner.nextLine();
            }

            // création du batiment
        }
    }

    private static void detruireUnite() {
        Scanner scanner = new Scanner(System.in);
        String reponse = "";

        while(!reponse.equals("O") && !reponse.equals("N")) {
            System.out.println("Voulez-vous détruire une unité ? (O = oui; N = non)");
            System.out.flush();
            reponse = scanner.nextLine();
        }

        detruireTypeUnite(scanner, reponse);
    }

    private static void detruireTypeUnite(Scanner scanner, String reponse) {
        if (reponse.equals("O")) {
            while(!reponse.equals("B") && !reponse.equals("M") && !reponse.equals("P")) {
                System.out.println("Quelle type d'unité voulez-vous détruire ? (B = bucheron; M = mineur; P = Paysan)");
                System.out.flush();
                reponse = scanner.nextLine();
            }

            // supprimer unité dans la liste des unités du joueur
        }
    }

    private static void detruireBatiment() {
        Scanner scanner = new Scanner(System.in);
        String reponse = "";

        while(!reponse.equals("O") && !reponse.equals("N")) {
            System.out.println("Voulez-vous détruire un batiment ? (O = oui; N = non)");
            System.out.flush();
            reponse = scanner.nextLine();
        }

        detruireTypeBatiment(scanner, reponse);
    }

    private static void detruireTypeBatiment(Scanner scanner, String reponse) {
        if (reponse.equals("O")) {
            while(!reponse.contains("B") && !reponse.contains("M") && !reponse.contains("P")) {
                System.out.println("Quelle type de batiment voulez-vous détruire ? (UB = unité bucheron; UM = unité mineur; UP = unité Paysan; OB = outil bucheron; OM = outil mineur; OP = outil Paysan)");
                System.out.flush();
                reponse = scanner.nextLine();
            }

            // supprimer batiment dans la liste des batiment du joueur
        }
    }
}
