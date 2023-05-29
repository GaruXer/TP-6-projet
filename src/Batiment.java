import java.util.Map;
import java.util.TreeMap;

public class Batiment {
    protected Ressource type;
    protected Map<Ressource, Integer> coutProduction;
    protected int intervelleProduction;

    public Batiment(Ressource type) {
        this.type = type;
        this.coutProduction = new TreeMap<>();
        coutProduction.put(Ressource.BOIS, 5);
        coutProduction.put(Ressource.PIERRE, 5);
        coutProduction.put(Ressource.OR, 5);
        coutProduction.put(Ressource.NOURRITURE, 5);
        this.intervelleProduction = 3;
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
