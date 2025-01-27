package Decorateur;

/**
 * Class that represents a multihull sailboat
 */
public class Multicoque extends Voilier {

    /**
     * Constructor that allows creating a multihull sailboat
     * @param nom The name of the sailboat
     */
    public Multicoque(String nom) {
        super(nom);
    }

    /**
     * Constructor that allows creating a multihull sailboat
     * @param nom The name of the sailboat
     * @param suivreRoute The follow route behavior of the sailboat
     */
    public Multicoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }

    /**
     * Returns a string representation of the sailboat with additional description
     * @return A string describing the sailboat type
     */
    public String toString() {
        return super.toString() + "\n The type of sailboat is: multihull";
    }
}
