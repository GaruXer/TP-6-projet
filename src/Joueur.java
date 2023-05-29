import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Joueur {
    private Map<Ressource, Integer> coffre;

    private List<Unite> l_unites;

    public Joueur() {
        this.coffre = new TreeMap<>();
        coffre.put(Ressource.BOIS, 20);
        coffre.put(Ressource.PIERRE, 20);
        coffre.put(Ressource.OR, 20);
        coffre.put(Ressource.NOURRITURE, 20);

        this.l_unites = new ArrayList<>();
    }

    /**
     * getter et setter
     */

    public Map<Ressource, Integer> getCoffre() {
        return coffre;
    }

    public void setCoffre(Map<Ressource, Integer> coffre) {
        this.coffre = coffre;
    }

    public List<Unite> getUnites() {
        return l_unites;
    }

    public void setUnites(List<Unite> l_unites) {
        this.l_unites = l_unites;
    }

    /**
     * methodes
     */
}
