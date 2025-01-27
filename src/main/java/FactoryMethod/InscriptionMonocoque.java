package FactoryMethod;

public class InscriptionMonocoque extends InscriptionVoilier{

    public InscriptionMonocoque(){
        super();
    }

    public Monocoque factoryMethod(String nom, String skipper, String classe) {
        if(classe.equals("Class40") || classe.equals("Imoca") || classe.equals("RhumMono")){
            Monocoque monocoque = new Monocoque(nom, skipper, classe);
            this.voiliers.add(monocoque);
            return monocoque;
        }
        return null;
}
}
