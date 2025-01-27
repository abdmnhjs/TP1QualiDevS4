package Decorateur;

public class Multicoque extends Voilier{

    public Multicoque(String nom){
        super(nom);
    }

    public Multicoque(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    public String toString(){
        return super.toString() +"\n Le type du voilier est multicoque";

    }
}
