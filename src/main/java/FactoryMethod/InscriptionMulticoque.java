package FactoryMethod;

public class InscriptionMulticoque extends InscriptionVoilier{
    public Multicoque factoryMethod(String nom, String skipper, String classe) {
        if(classe.equals("Multi50") || classe.equals("Ultim") || classe.equals("RhumMulti")){
            Multicoque multicoque = new Multicoque(nom, skipper, classe);
            this.voiliers.add(multicoque);
            return multicoque;
        }
        return null;
    }
}
