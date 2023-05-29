public class Outil {
    private String nom;
    private int niveau;

    public Outil(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    /**
     * getter et setter
     */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
