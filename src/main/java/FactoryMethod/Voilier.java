package FactoryMethod;

import FactoryMethod.SuivreRoute;

public abstract class Voilier {

    protected String nom;
    protected String skipper;
    protected String classe;
    protected SuivreRoute suivreRoute; // suivreRoute appartient à une classe qui implemente l'interface Decorateur.SuivreRoute

    public Voilier(String nom) {
        this.nom = nom;
    }

    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    public Voilier(String nom, String skipper, String classe){
        this.nom = nom;
        this.skipper = skipper;
        this.classe = classe;
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
