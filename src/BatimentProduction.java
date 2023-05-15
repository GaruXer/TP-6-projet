import java.util.TreeMap;

public class BatimentProduction extends Batiment {
    private Unite typeUnite;

    public BatimentProduction(TreeMap<Ressource, Integer> coutProduction, int intervelleProduction, Unite typeUnite) {
        super(coutProduction, intervelleProduction);
        this.typeUnite = typeUnite;
    }

    /**
     * getter et setter
     */

    public Unite getTypeUnite() {
        return typeUnite;
    }

    public void setTypeUnite(Unite typeUnite) {
        this.typeUnite = typeUnite;
    }
}
