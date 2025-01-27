package Decorateur;

public class Velo extends ArmementSupplementaire {

    public Velo(Voilier composantDecorer){
        super(composantDecorer);
    }

    public String toString(){
        return  composantDecorer.toString() + " et c'est un velo" ;
    }
}
