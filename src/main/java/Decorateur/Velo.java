package Decorateur;

/**
 * Class that represents a bicycle, which is an additional armament for a sailboat
 * and decorates the sailboat.
 */
public class Velo extends ArmementSupplementaire {

    /**
     * Constructor that allows decorating a sailboat with a bicycle
     * @param composantDecorer The sailboat component to be decorated
     */
    public Velo(Voilier composantDecorer) {
        super(composantDecorer);
    }

    /**
     * Returns a string representation of the decorated sailboat with additional description
     * @return A string describing the decorated sailboat
     */
    public String toString() {
        return composantDecorer.toString() + " and it's a bicycle";
    }
}
