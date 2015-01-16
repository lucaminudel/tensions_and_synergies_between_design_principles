
package tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.before;

import tensionsBetweenDifferentOOPrinciples.Tuple;

public class RosieRobot {
    // RosieRobot class represents a robot that accept commands to move in four directions.
    // RosieRobot class has no dependencies so it has a very low coupling.
    // RosieRobot class code is very similar to the UniblabRobot class code so it violates the DRY principle.

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

        return newPosition;
    }
}

