import java.util.Map;

public class Unite {
    private String type;
    private int positionX;
    private int positionY;
    private int vitesse;
    private int coutNourriture;
    private Outil outil;
    private int jaugeExperience;

    public Unite(String type, int positionX, int positionY, int vitesse, int coutNourriture, Outil outil, int jaugeExperience) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.vitesse = vitesse;
        this.coutNourriture = coutNourriture;
        this.outil = outil;
        this.jaugeExperience = jaugeExperience;
    }

    /**
     * getter et setter
     */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getCoutNourriture() {
        return coutNourriture;
    }

    public void setCoutNourriture(int coutNourriture) {
        this.coutNourriture = coutNourriture;
    }

    public Outil getOutil() {
        return outil;
    }

    public void setOutil(Outil outil) {
        this.outil = outil;
    }

    public int getJaugeExperience() {
        return jaugeExperience;
    }

    public void setJaugeExperience(int jaugeExperience) {
        this.jaugeExperience = jaugeExperience;
    }
}
