package school.calculus.affirmation;

public final class Ou extends Affirmation {
    Affirmation premiereAffirmation, deuxiemeAffirmation;

    public Ou(String affirmation, Affirmation premiereAffirmation, Affirmation deuxiemeAffirmation) {
        super(affirmation);
        this.premiereAffirmation = premiereAffirmation;
        this.deuxiemeAffirmation = deuxiemeAffirmation;
    }

    @Override
    public String estVraie() {
        String premiereAffirmationEstVraie = premiereAffirmation.estVraie();
        String deuxiemeAffirmationEstVraie = deuxiemeAffirmation.estVraie();

        if (premiereAffirmationEstVraie.equals("je-ne-sais-pas") && deuxiemeAffirmationEstVraie.equals("ja-ne-sais-pas")) {
            return "je-ne-sais-pas";
        }
        if (premiereAffirmationEstVraie.equals("vrai") || deuxiemeAffirmationEstVraie.equals("vrai")) {
            return "vrai";
        }
        return "faux";
    }
}