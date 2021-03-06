
package tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.before;


import tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.Tuple;

public class RosieRobot {
    // RosieRobot class represents a robot that accepts commands to move in four directions.
    // RosieRobot class has no dependencies so it has a very low coupling or no coupling at all.
    // RosieRobot class code is very similar to the UniblabRobot class code so it violates the DRY principle.

    private Tuple<Integer, Integer> _currentPosition = new Tuple<>(5, 5);

    public void MoveOneNorth() {
        Tuple<Integer, Integer> north = new Tuple<>(1, 0);
        _currentPosition = NewPosition(north);
    }

    public void MoveOneSouth() {
        Tuple<Integer, Integer> south = new Tuple<>(-1, 0);
        _currentPosition = NewPosition(south);
    }

    public void MoveOneEast() {
        Tuple<Integer, Integer> east = new Tuple<>(0, 1);
        _currentPosition = NewPosition(east);
    }

    public void MoveOneWest() {
        Tuple<Integer, Integer> west = new Tuple<>(0, -1);
        _currentPosition = NewPosition(west);
    }

    private Tuple<Integer, Integer> NewPosition(Tuple<Integer, Integer> move) {
        Tuple<Integer, Integer> newPosition = new Tuple<>(_currentPosition.getItem1() + move.getItem1(),
                _currentPosition.getItem2() + move.getItem2());

        return newPosition;
    }
}

