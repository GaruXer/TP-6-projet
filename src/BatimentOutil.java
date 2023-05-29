import java.util.List;
import java.util.TreeMap;

public class BatimentOutil extends Batiment {
    private String typeOutil;

    public BatimentOutil(TreeMap<Ressource, Integer> coutProduction, int intervelleProduction, String typeOutil) {
        super(coutProduction, intervelleProduction);
        this.typeOutil = typeOutil;
    }

    /**
     * getter et setter
     */

    public String getTypeOutil() {
        return typeOutil;
    }

    public void setTypeOutil(String typeOutil) {
        this.typeOutil = typeOutil;
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
