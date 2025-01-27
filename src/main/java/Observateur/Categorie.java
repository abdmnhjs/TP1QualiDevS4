package Observateur;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Observateur{
    String nomCategorie;
    List<Abandon> abandons;

    public Categorie(String nomCategorie){
        this.nomCategorie = nomCategorie;
        abandons = new ArrayList<Abandon>();
    }

    @Override
    public void actualise(Observable o) {
        DirectionCourse directionCourse = (DirectionCourse) o;
        Abandon abandon = directionCourse.getDernierAbandon();
        if(abandon.getCategorie().equals(this.nomCategorie)){
            abandons.add(abandon);
        }
    }
}
