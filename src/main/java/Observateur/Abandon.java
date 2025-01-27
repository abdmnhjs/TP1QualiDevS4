package Observateur;

public class Abandon {
    String nomVoilier;
    String categorie;
    String nomSkipper;

    Abandon(String nomVoilier, String categorie, String nomSkipper) {
        this.nomVoilier=nomVoilier;
        this.categorie=categorie;
        this.nomSkipper=nomSkipper;
    }

    public String getCategorie() {
        return categorie;
    }
}
