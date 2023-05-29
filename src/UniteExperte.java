import java.util.Map;

public class UniteExperte extends Unite {
    protected Unite unite;

    protected int tourSansNourriture;

    public UniteExperte(Unite unite) {
        super(unite.type, unite.positionX, unite.positionY, unite.vitesse + 2, unite.coutNourriture * 2, unite.jaugeExperience);
        this.unite = unite;
        this.tourSansNourriture = 0;
    }

    /**
     * getter et setter
     */

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }

    public int getTourSansNourriture() {
        return tourSansNourriture;
    }

    public void setTourSansNourriture(int tourSansNourriture) {
        this.tourSansNourriture = tourSansNourriture;
    }

    /**
     * methodes
     */

    public void redevenirUnite() {

    }
}
