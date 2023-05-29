import java.util.Map;
import java.util.TreeMap;

public class Batiment {
    protected Ressource type;
    protected Map<Ressource, Integer> coutProduction;
    protected int intervelleProduction;

    public Batiment(Ressource type, TreeMap<Ressource, Integer> coutProduction, int intervelleProduction) {
        this.type = type;
        this.coutProduction = coutProduction;
        this.intervelleProduction = intervelleProduction;
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

    /**
     * methodes
     */

    public void produire(Joueur joueur) {
        if (joueur.getCoffre().get(this.type) < this.coutProduction.get(this.type)) {
            joueur.getCoffre().replace(this.type, joueur.getCoffre().get(this.type) - this.coutProduction.get(this.type));
        } else {
            System.out.println("impossible de produire l'outil de type " + this.type);
        }
    }
}
