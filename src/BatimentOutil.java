import java.util.TreeMap;

public class BatimentOutil extends Batiment {
    private Outil typeOutil;

    public BatimentOutil(TreeMap<Ressource, Integer> coutProduction, int intervelleProduction, Outil typeOutil) {
        super(coutProduction, intervelleProduction);
        this.typeOutil = typeOutil;
    }

    /**
     * getter et setter
     */

    public Outil getTypeOutil() {
        return typeOutil;
    }

    public void setTypeOutil(Outil typeOutil) {
        this.typeOutil = typeOutil;
    }
}
