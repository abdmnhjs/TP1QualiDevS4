package Decorateur;

/**
 * Abstract class that represents a sailboat
 */
public abstract class Voilier {

    private String name;
    private SuivreRoute suivreRoute; // suivreRoute belongs to a class that implements the Decorateur.SuivreRoute interface

    /**
     * Constructor that allows creating a sailboat with a name
     * @param name The name of the sailboat
     */
    public Voilier(String name) {
        this.name = name;
    }

    /**
     * Constructor that allows creating a sailboat with a name and a follow route behavior
     * @param name The name of the sailboat
     * @param suivreRoute The follow route behavior of the sailboat
     */
    public Voilier(String name, SuivreRoute suivreRoute) {
        this.name = name;
        this.suivreRoute = suivreRoute;
    }

    /**
     * Default constructor
     */
    public Voilier() {

    }

    /**
     * Returns a string representation of the sailboat
     * @return A string describing the sailboat
     */
    public String toString() {
        return "The name of the sailboat is: " + name;
    }

    /**
     * Sets the follow route behavior for the sailboat
     * @param suivreRoute The follow route behavior
     */
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.suivreRoute = suivreRoute;
    }

    /**
     * Applies the follow route behavior
     */
    public void appliqueSuivreRoute() {
        this.suivreRoute.suivreRoute();
    }
}
