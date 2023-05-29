public class Outil {
    private Ressource type;
    private int niveau;

    public Outil(Ressource type, int niveau) {
        this.type = type;
        this.niveau = niveau;
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

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    /**
     * methodes
     */

    public void augmenterNiveau() {
        this.niveau++;
    }
}
