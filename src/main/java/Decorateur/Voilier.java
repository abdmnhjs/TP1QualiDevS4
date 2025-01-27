package Decorateur;

public abstract class Voilier {

    private String nom;
    private SuivreRoute suivreRoute; // suivreRoute appartient à une classe qui implemente l'interface Decorateur.SuivreRoute

    public Voilier(String nom) {
        this.nom = nom;
    }

    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    public Voilier() {

    }

    public String toString() {
        return "Le nom du voilier est: "+ nom;
    }

    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.suivreRoute = suivreRoute;
    }

    public void appliqueSuivreRoute(){
        this.suivreRoute.suivreRoute();

    }
}
