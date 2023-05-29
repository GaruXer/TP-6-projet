import java.util.Map;

public class Unite {
    protected Ressource type;
    protected int positionX;
    protected int positionY;
    protected double vitesse;
    protected int coutNourriture;
    protected Outil outil;
    protected int jaugeExperience;

    public Unite(Ressource type, int positionX, int positionY, double vitesse, int coutNourriture, int jaugeExperience) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.vitesse = vitesse;
        this.coutNourriture = coutNourriture;
        this.outil = new Outil(type, 1);
        this.jaugeExperience = jaugeExperience;
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

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
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

    /**
     * methodes
     */

    public UniteExperte devenirUniteExperte() {
        return new UniteExperte(this);
    }

    public UniteMontee devenirUniteMontee() {
        return new UniteMontee(this);
    }

    public void recolter(Joueur joueur, Case aCase) {
        int nbRessourceCoffre = joueur.getCoffre().get(this.type);
        int nbRessourceCase = aCase.getRessource().get(this.type);

        if (nbRessourceCase > 0 && nbRessourceCase > this.outil.getNiveau()) {
            joueur.getCoffre().replace(this.type, nbRessourceCoffre + this.outil.getNiveau());
            aCase.getRessource().replace(this.type, nbRessourceCase - this.outil.getNiveau());
        } else {
            joueur.getCoffre().replace(this.type, nbRessourceCoffre + nbRessourceCase);
            aCase.getRessource().replace(this.type, 0);
        }
    }
}
