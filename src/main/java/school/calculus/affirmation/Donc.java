package school.calculus.affirmation;

public final class Donc extends Affirmation {
    Affirmation premiereAffirmation, deuxiemeAffirmation;

    public Donc(String affirmation, Affirmation premiereAffirmation, Affirmation deuxiemeAffirmation) {
        super(affirmation);
        this.premiereAffirmation = premiereAffirmation;
        this.deuxiemeAffirmation = deuxiemeAffirmation;
    }

    @Override
    public String estVraie() {
        String premiereAffirmationEstVraie = premiereAffirmation.estVraie();
        String deuxiemeAffirmationEstVraie = deuxiemeAffirmation.estVraie();

        if (premiereAffirmationEstVraie.equals("je-ne-sais-pas") || deuxiemeAffirmationEstVraie.equals("je-ne-sais-pas")) {
            return "je-ne-sais-pas";
        }
        return (premiereAffirmationEstVraie.equals("vrai") || deuxiemeAffirmationEstVraie.equals("faux")) ? "faux" : "vrai";
    }
}