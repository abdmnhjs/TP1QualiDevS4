package Decorateur;

/**
 * Class that represents a monohull sailboat
 */
public class Monocoque extends Voilier {

    /**
     * Constructor that allows creating a monohull sailboat
     * @param name The name of the sailboat
     * @param suivreRoute The follow route behavior of the sailboat
     */
    public Monocoque(String name, SuivreRoute suivreRoute) {
        super(name, suivreRoute);
    }

    /**
     * Returns a string representation of the sailboat with additional description
     * @return A string describing the sailboat type
     */
    public String toString() {
        return super.toString() + "\n The type of sailboat is: monohull";
    }
}
