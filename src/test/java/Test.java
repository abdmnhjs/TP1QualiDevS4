import Decorateur.*;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testVeloDecoration() {
        Multicoque mu = new Multicoque("le aziz", new Routedirecte());
        Voilier voilier = new Multicoque("MaMulticoque");

        voilier = new Velo(voilier);
        assertEquals("L'armement est de", voilier.toString());

        voilier = new Foil(voilier);
        assertEquals("L'armement est de ", voilier.toString());
    }

    @org.junit.Test
    public void testMultipleDecorations() {
        Multicoque mu = new Multicoque("le aziz", new Routedirecte());
        Voilier voilier = new Multicoque("MaMulticoque");

        Velo velo = new Velo(voilier);
        Foil foil = new Foil(velo);

        assertEquals("L'armement est MaMulticoque et a un velo et a un foil", foil.toString());
    }
}

