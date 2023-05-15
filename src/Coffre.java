import java.util.Map;
import java.util.TreeMap;

public class Coffre {
    private Map<Ressource, Integer> coffre;

    public Coffre() {
        this.coffre = new TreeMap<>();
        coffre.put(Ressource.BOIS, 20);
        coffre.put(Ressource.PIERRE, 20);
        coffre.put(Ressource.OR, 20);
        coffre.put(Ressource.NOURRITURE, 20);
    }

    public Map<Ressource, Integer> getCoffre() {
        return coffre;
    }

    public void setCoffre(Map<Ressource, Integer> coffre) {
        this.coffre = coffre;
    }

    @Override
    public String toString() {
        return "Coffre" + coffre;
    }
}
