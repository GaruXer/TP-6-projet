import java.util.List;

public class CarteDuJeu {
    private int tailleX;
    private int tailleY;
    private List<Case> cases;

    public CarteDuJeu(int tailleX, int tailleY, List<Case> cases) {
        this.tailleX = tailleX;
        this.tailleY = tailleY;
        this.cases = cases;
    }

    /**
     * getter et setter
     */

    public int getTailleX() {
        return tailleX;
    }

    public void setTailleX(int tailleX) {
        this.tailleX = tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }

    public void setTailleY(int tailleY) {
        this.tailleY = tailleY;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }
}