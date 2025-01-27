package Observateur;

import Decorateur.Voilier;

import java.util.ArrayList;
import java.util.List;

public class DirectionCourse implements Observable{
    private List<Observateur> observateurs;
    private List<Abandon> abandons;
    public DirectionCourse(Voilier observe){
        this.observateurs = new ArrayList<Observateur>();
        this.abandons = new ArrayList<Abandon>();
    }

    @Override
    public void enregistreObservateur(Observateur o) {
        this.observateurs.add(o);
    }

    @Override
    public void desenregistreObservateur(Observateur o) {
        this.observateurs.remove(o);
    }

    @Override
    public void informeObservateurs(Observateur o) {
        if(this.observateurs.contains(o)){
            o.actualise(this);
        }
    }

    public Abandon getDernierAbandon(){
        return this.abandons.get(abandons.size()-1);
    }
}
