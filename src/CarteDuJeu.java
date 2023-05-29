import java.util.ArrayList;
import java.util.List;

public class CarteDuJeu {
    private int tailleX;
    private int tailleY;
    private ArrayList<Case> l_cases;

    public CarteDuJeu(int tailleX, int tailleY, ArrayList<Case> l_cases) {
        this.tailleX = tailleX;
        this.tailleY = tailleY;
        this.l_cases = l_cases;
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

    public ArrayList<Case> getCases() {
        return l_cases;
    }

    public void setCases(ArrayList<Case> l_cases) {
        this.l_cases = l_cases;
    }
}
