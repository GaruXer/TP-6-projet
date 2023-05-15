import java.util.Map;

public class Case {
    private int positionX;
    private int positionY;
    private Map<Ressource, Integer> ressource;

    public Case(int positionX, int positionY, Map<Ressource, Integer> ressource) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.ressource = ressource;
    }

    /**
     * getter et setter
     */

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Map<Ressource, Integer> getRessource() {
        return ressource;
    }

    public void setRessource(Map<Ressource, Integer> ressource) {
        this.ressource = ressource;
    }
}
