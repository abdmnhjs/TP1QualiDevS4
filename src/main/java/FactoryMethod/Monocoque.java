package FactoryMethod;

import FactoryMethod.SuivreRoute;
import FactoryMethod.Voilier;

public class Monocoque extends Voilier {

    public Monocoque(String name, SuivreRoute suivreRoute){
        super(name, suivreRoute);

    }

    public Monocoque(String nom, String skipper, String classe){
        super(nom, skipper, classe);
    }

    public String toString(){
        return super.toString() +"\n Le type du voilier est: mutlicoque";

    }
}
