import java.util.List;

public class Joueur {
    private Coffre coffre;

    private List<Unite> l_unites;

    public Joueur(Coffre coffre, List<Unite> l_unites) {
        this.coffre = coffre;
        this.l_unites = l_unites;
    }

    /**
     * getter et setter
     */

    public Coffre getCoffre() {
        return coffre;
    }

    public void setCoffre(Coffre coffre) {
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
