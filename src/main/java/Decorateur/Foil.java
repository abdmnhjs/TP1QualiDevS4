package Decorateur;

public class Foil extends ArmementSupplementaire{

    public Foil(Voilier composantDecorer){
        super(composantDecorer);

    }

    public String toString(){
        return composantDecorer.toString() + " et c'est un foil";
    }
}
