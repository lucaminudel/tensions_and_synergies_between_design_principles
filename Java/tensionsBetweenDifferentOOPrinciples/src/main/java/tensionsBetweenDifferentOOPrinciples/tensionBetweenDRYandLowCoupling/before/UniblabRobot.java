
package tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.before;

import tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.Tuple;

public class UniblabRobot {
    // UniblabRobot class represents a robot that accepts commands to move in four directions.
    // UniblabRobot class has no dependencies so it has a very low coupling or no coupling at all.
    // UniblabRobot class code is very similar to the RosieRobot class code so it violates the DRY principle.

    private Tuple<Integer, Integer> _currentPosition = new Tuple<>(5, 5);

    public void MoveOneNorthEast() {
        Tuple<Integer, Integer> northEast = new Tuple<>(1, 1);
        _currentPosition = NewPosition(northEast);
    }

    public void MoveOneNorthWest() {
        Tuple<Integer, Integer> northWest = new Tuple<>(1, -1);
        _currentPosition = NewPosition(northWest);
    }

    public void MoveOneSouthEast() {
        Tuple<Integer, Integer> southEast = new Tuple<>(-1, 1);
        _currentPosition = NewPosition(southEast);
    }

    public void MoveOneSouthWest() {
        Tuple<Integer, Integer> southWestst = new Tuple<>(-1, -1);
        _currentPosition = NewPosition(southWestst);
    }

    private Tuple<Integer, Integer> NewPosition(Tuple<Integer, Integer> move) {
        Tuple<Integer, Integer> newPosition = new Tuple<>(_currentPosition.getItem1() + move.getItem1(),
                _currentPosition.getItem2() + move.getItem2());

        return newPosition;
    }

}

