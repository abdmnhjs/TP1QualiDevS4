package Decorateur;

/**
 *
 */
public abstract class ArmementSupplementaire extends Voilier{

    Voilier composantDecorer;

    public ArmementSupplementaire(Voilier composantDecorer) {
        super();
        this.composantDecorer = composantDecorer;
    }

    public void appliqueSuivreRoute(){
        this.composantDecorer.appliqueSuivreRoute();
    }

    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.composantDecorer.setSuivreRoute(suivreRoute);
    }
}
