import java.util.List;
import java.util.TreeMap;

public class BatimentProduction extends Batiment {
    public BatimentProduction(Ressource type) {
        super(type);
    }

    /**
     * methodes
     */

    public void creerUnite(Joueur joueur) {
        List<Unite> l_unites = joueur.getUnites();

        Unite unite = new Unite(this.type, 0,0,3,3);
        l_unites.add(unite);
    }
}
