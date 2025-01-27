package Decorateur;

public class Monocoque extends Voilier{

    public Monocoque(String name, SuivreRoute suivreRoute){
        super(name, suivreRoute);

    }

    public String toString(){
        return super.toString() +"\n Le type du voilier est: mutlicoque";

    }
}
