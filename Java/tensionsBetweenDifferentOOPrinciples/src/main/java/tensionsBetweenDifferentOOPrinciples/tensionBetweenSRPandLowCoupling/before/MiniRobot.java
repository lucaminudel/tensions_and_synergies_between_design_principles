package tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandLowCoupling.before;

import sun.plugin.dom.exception.InvalidStateException;
import tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandLowCoupling.Tuple;

public class MiniRobot {
    // MiniRobot class represents a plateau with well defined boundaries *and* represent a robot that
    // accepts commands to move in four directions inside the plateau.
    // So MiniRobot class violates the Single Responsibility Principle (SRP), while it has no logical or
    // physical dependencies to other classes, so it has a low coupling.

    private Tuple<Integer, Integer> _plateau = new Tuple<Integer, Integer>(11, 13);
    private Tuple<Integer, Integer> _currentPosition = new Tuple<Integer, Integer>(5, 5);

    public void MoveOneNorth() {
        Tuple<Integer, Integer> north = new Tuple<Integer, Integer>(1, 0);
        _currentPosition = NewPosition(north);
    }

    public void MoveOneSouth() {
        Tuple<Integer, Integer> south = new Tuple<Integer, Integer>(-1, 0);
        _currentPosition = NewPosition(south);
    }

    public void MoveOneEast() {
        Tuple<Integer, Integer> east = new Tuple<Integer, Integer>(0, 1);
        _currentPosition = NewPosition(east);
    }

    public void MoveOneWest() {
        Tuple<Integer, Integer> west = new Tuple<Integer, Integer>(0, -1);
        _currentPosition = NewPosition(west);
    }

    private Tuple<Integer, Integer> NewPosition(Tuple<Integer, Integer> move) {
        Tuple<Integer, Integer> newPosition = new Tuple<Integer, Integer>(_currentPosition.getItem1() + move.getItem1(),
                _currentPosition.getItem2() + move.getItem2());

        if ((newPosition.getItem1() < 0 || _plateau.getItem1() < newPosition.getItem1()) ||
                (newPosition.getItem2() < 0 || _plateau.getItem2() < newPosition.getItem2()))
            throw new InvalidStateException("Tentative to move outside plateau boundaries");

        return newPosition;
    }
}

