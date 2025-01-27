package Decorateur;

/**
 * Class that decorates a sailboat
 * @author Chaaraoui Abdelaziz
 */
public abstract class ArmementSupplementaire extends Voilier {

    /**
     * Instance of a sailboat
     */
    Voilier composantDecorer;

    /**
     * Constructor that allows decorating a sailboat
     * @param composantDecorer
     */
    public ArmementSupplementaire(Voilier composantDecorer) {
        super();
        this.composantDecorer = composantDecorer;
    }

    /**
     * Method that applies a behavior to the composantDecorer field
     */
    public void appliqueSuivreRoute() {
        this.composantDecorer.appliqueSuivreRoute();
    }

    /**
     * Method that changes behavior of the composantDecorer field
     * @param suivreRoute
     */
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.composantDecorer.setSuivreRoute(suivreRoute);
    }
}
