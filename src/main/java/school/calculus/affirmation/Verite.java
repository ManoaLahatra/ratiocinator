package school.calculus.affirmation;

public final class Verite extends Affirmation {
    public Verite(String affirmation) {
        super(affirmation);
    }

    @Override
    public String estVraie() {
        return "vrai";
    }
}