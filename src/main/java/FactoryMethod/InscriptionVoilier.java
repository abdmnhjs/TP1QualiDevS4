package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class InscriptionVoilier {
    protected List<Voilier> voiliers;

    public InscriptionVoilier() {
        this.voiliers = new ArrayList<Voilier>();
    }

    public abstract Voilier factoryMethod(String nom, String skipper, String classe);
}
