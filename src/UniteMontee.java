import java.util.Map;

public class UniteMontee extends Unite {

    protected Unite unite;

    public UniteMontee(Unite unite) {
        super(unite.type, unite.positionX, unite.positionY, unite.vitesse * 1.5, unite.coutNourriture + 3, unite.outil, unite.jaugeExperience);
        this.unite = unite;
    }
}
