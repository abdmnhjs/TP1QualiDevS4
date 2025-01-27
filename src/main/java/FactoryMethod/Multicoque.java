package FactoryMethod;

import FactoryMethod.SuivreRoute;
import FactoryMethod.Voilier;

public class Multicoque extends Voilier {

    public Multicoque(String nom){
        super(nom);
    }

    public Multicoque(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    public Multicoque(String nom, String skipper, String classe){
        super(nom, skipper, classe);
    }

    public String toString(){
        return super.toString() +"\n Le type du voilier est multicoque";

    }
}
