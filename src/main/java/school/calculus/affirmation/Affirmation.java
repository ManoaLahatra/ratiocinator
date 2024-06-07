package school.calculus.affirmation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public sealed abstract class Affirmation permits Verite, Mensonge, Et, Ou, Donc, Doute {
    protected String affirmation;
    public abstract String estVraie();
}