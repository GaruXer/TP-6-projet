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
}
