import java.util.List;
import java.util.TreeMap;

public class BatimentProduction extends Batiment {
    private Ressource type;

    public BatimentProduction(TreeMap<Ressource, Integer> coutProduction, int intervelleProduction, Ressource type) {
        super(coutProduction, intervelleProduction);
        this.type = type;
    }

    /**
     * getter et setter
     */

    public Ressource getType() {
        return type;
    }

    public void setType(Ressource type) {
        this.type = type;
    }

    /**
     * methodes
     */

    public void creerUnite(Joueur joueur) {
        List<Unite> l_unites = joueur.getUnites();

        Unite unite = new Unite(this.type, 0,0,3,3,0);
        l_unites.add(unite);
    }
}
