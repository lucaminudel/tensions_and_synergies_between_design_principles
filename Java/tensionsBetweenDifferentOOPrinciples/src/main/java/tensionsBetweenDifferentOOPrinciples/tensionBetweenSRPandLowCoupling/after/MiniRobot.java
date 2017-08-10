package tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandLowCoupling.after;

import tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandLowCoupling.Tuple;
import sun.plugin.dom.exception.InvalidStateException;

public class MiniRobot {
    // MiniRobot class now represents only a robot that accepts commands to move in four directions
    // inside the plateau.
    // So MiniRobot class follows the Single Responsibility Principle (SRP). While it has an
    // additional dependency on the Plateau class. Because of it, coupling is higher than before.
    // The type of coupling introduced here is called 'message coupling'.

    private final Plateau _plateau = new Plateau();
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

        if (!_plateau.Contains(newPosition))
            throw new InvalidStateException("Tentative to move outside plateau boundaries");


        return newPosition;
    }
}

