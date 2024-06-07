package school.calculus.affirmation;

public final class Doute extends Affirmation {

    public Doute(String affirmation) {
        super(affirmation);
    }

    @Override
     public String estVraie() {
        return "je-ne-sais-pas";
    }
}