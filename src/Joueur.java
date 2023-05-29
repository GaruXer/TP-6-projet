import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Joueur {
    private int nbRessourceDepart;
    private Map<Ressource, Integer> coffre;
    private ArrayList<Unite> l_unites;
    private ArrayList<BatimentOutil> l_batimentsOutil;
    private ArrayList<BatimentProduction> l_batimentsProduction;

    public Joueur() {
        this.coffre = new TreeMap<>();
        coffre.put(Ressource.BOIS, this.nbRessourceDepart);
        coffre.put(Ressource.PIERRE, this.nbRessourceDepart);
        coffre.put(Ressource.OR, this.nbRessourceDepart);
        coffre.put(Ressource.NOURRITURE, this.nbRessourceDepart);

        this.l_unites = new ArrayList<>();
    }

    /**
     * getter et setter
     */

    public int getNbRessourceDepart() {
        return nbRessourceDepart;
    }

    public void setNbRessourceDepart(int nbRessourceDepart) {
        this.nbRessourceDepart = nbRessourceDepart;
    }

    public Map<Ressource, Integer> getCoffre() {
        return coffre;
    }

    public void setCoffre(Map<Ressource, Integer> coffre) {
        this.coffre = coffre;
    }

    public List<Unite> getUnites() {
        return l_unites;
    }

    public void setUnites(ArrayList<Unite> l_unites) {
        this.l_unites = l_unites;
    }

    public ArrayList<BatimentOutil> getBatimentsOutil() {
        return l_batimentsOutil;
    }

    public void setBatimentsOutil(ArrayList<BatimentOutil> l_batimentsOutil) {
        this.l_batimentsOutil = l_batimentsOutil;
    }

    public ArrayList<BatimentProduction> getBatimentsProduction() {
        return l_batimentsProduction;
    }

    public void setBatimentsProduction(ArrayList<BatimentProduction> l_batimentsProduction) {
        this.l_batimentsProduction = l_batimentsProduction;
    }
}
