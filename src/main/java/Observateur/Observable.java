package Observateur;

public interface Observable {
    public void enregistreObservateur(Observateur o);
    public void desenregistreObservateur(Observateur o);
    public void informeObservateurs(Observateur o);
}
