package school.calculus;


import org.junit.jupiter.api.Test;
import school.calculus.affirmation.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculusRatiocinatorTest
{

    @Test
    public void louEstPauvreEtLouEstGenereux()
    {
        Affirmation louEstPauvre = new Verite("Lou est pauvre");
        Affirmation louEstGenereux = new Doute("Lou est généreux");

        String louEstPauvreEtLouEstGenereux = new Et("Lou est pauvre et Lou est généreux.", louEstPauvre, louEstGenereux).estVraie();

        assertEquals(louEstPauvreEtLouEstGenereux, "je-ne-sais-pas");
    }

    @Test
    public void louEstBeauDoncLouEstPauvre()
    {
        Affirmation louEstBeau = new Verite("Lou est beau");
        Affirmation louEstPauvre = new Mensonge("Lou est pauvre");

        String louEstBeauDoncLouEstPauvre = new Donc("Lou est beau. Donc Lou est pauvre.", louEstBeau, louEstPauvre).estVraie();

        assertEquals(louEstBeauDoncLouEstPauvre, "faux");
    }

    @Test
    public void louEstPauvreDoncLouEstGenereux()
    {
        Affirmation louEstPauvre = new Mensonge("Lou est pauvre");
        Affirmation louEstGenereux = new Doute("Lou est généreux");

        String louEstPauvreDoncLouEstGenereux = new Donc("Lou est pauvre. Donc Lou est généreux.", louEstPauvre, louEstGenereux).estVraie();

        assertEquals(louEstPauvreDoncLouEstGenereux, "je-ne-sais-pas");
    }
}
