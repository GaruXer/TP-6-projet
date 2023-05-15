import java.util.Map;
import java.util.TreeMap;

public abstract class Batiment {
    private Map<Ressource, Integer> coutProduction;
    private int intervelleProduction;

    public Batiment(TreeMap<Ressource, Integer> coutProduction, int intervelleProduction) {
        this.coutProduction = coutProduction;
        this.intervelleProduction = intervelleProduction;
    }


    /**
     * getter et setter
     */

    public Map<Ressource, Integer> getCoutProduction() {
        return coutProduction;
    }

    public void setCoutProduction(Map<Ressource, Integer> coutProduction) {
        this.coutProduction = coutProduction;
    }

    public int getIntervelleProduction() {
        return intervelleProduction;
    }

    public void setIntervelleProduction(int intervelleProduction) {
        this.intervelleProduction = intervelleProduction;
    }
}
