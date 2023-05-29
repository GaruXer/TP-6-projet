import java.util.Map;

public class UniteExperte extends Unite {
    protected Unite unite;

    public UniteExperte(Unite unite) {
        super(unite.type, unite.positionX, unite.positionY, unite.vitesse + 2, unite.coutNourriture * 2, unite.outil, unite.jaugeExperience);
        this.unite = unite;
    }
}
