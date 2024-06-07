package school.calculus.affirmation;

public final class Mensonge extends Affirmation {

    public Mensonge(String affirmation) {
        super(affirmation);
    }

    @Override
    public String estVraie() {
        return "faux";
    }
}