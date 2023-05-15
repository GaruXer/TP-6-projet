import java.util.TreeMap;

public class BatimentProduction extends Batiment {
    private String typeUnite;

    public BatimentProduction(TreeMap<Ressource, Integer> coutProduction, int intervelleProduction, String typeUnite) {
        super(coutProduction, intervelleProduction);
        this.typeUnite = typeUnite;
    }

    /**
     * getter et setter
     */

    public String getTypeUnite() {
        return typeUnite;
    }

    public void setTypeUnite(String typeUnite) {
        this.typeUnite = typeUnite;
    }
}
