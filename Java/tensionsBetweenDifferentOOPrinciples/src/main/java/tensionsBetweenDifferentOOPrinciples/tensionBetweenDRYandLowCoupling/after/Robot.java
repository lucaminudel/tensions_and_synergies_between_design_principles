
package tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.after;


import tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.Tuple;

public class Robot {
    protected final Tuple<Integer, Integer> North = new Tuple<>(1, 0);
    protected final Tuple<Integer, Integer> South = new Tuple<>(-1, 0);
    protected final Tuple<Integer, Integer> East = new Tuple<>(0, 1);
    protected final Tuple<Integer, Integer> West = new Tuple<>(0, -1);

    protected Tuple<Integer, Integer> Add(Tuple<Integer, Integer> a, Tuple<Integer, Integer> b) {
        return new Tuple<>(a.getItem1() + b.getItem1(), a.getItem2() + b.getItem2());
    }
}

