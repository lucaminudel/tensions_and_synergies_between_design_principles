package tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandLowCoupling.after;

import tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandLowCoupling.Tuple;

public class Plateau {
    // Plateau class represents a plateau with well defined boundaries.
    // So Plateau class follows the Single Responsibility Principle (SRP).

    private final Tuple<Integer, Integer> _plateau = new Tuple<>(11, 13);

    public boolean Contains(Tuple<Integer, Integer> position) {
        return ((0 <= position.getItem1() || position.getItem1() <= _plateau.getItem1()) ||
                (0 <= position.getItem2() || position.getItem2() <= _plateau.getItem2()));
    }
}

