import java.util.List;
import java.util.TreeMap;

public class BatimentOutil extends Batiment {
    public BatimentOutil(Ressource type, TreeMap<Ressource, Integer> coutProduction, int intervelleProduction) {
        super(type, coutProduction, intervelleProduction);
    }

    /**
     * methodes
     */

    public void creerOutil(Joueur joueur) {
        List<Unite> l_unites = joueur.getUnites();
        Unite uniteAugmenterOutil = l_unites.get(0);

        for (Unite unite : l_unites) {
            if (uniteAugmenterOutil.outil.getNiveau() > unite.outil.getNiveau()) {
                uniteAugmenterOutil = unite;
            }
        }

        uniteAugmenterOutil.outil.augmenterNiveau();
    }
}
