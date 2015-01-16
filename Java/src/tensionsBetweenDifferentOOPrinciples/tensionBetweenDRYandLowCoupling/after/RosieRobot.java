
package tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.after;

import tensionsBetweenDifferentOOPrinciples.Tuple;

public class RosieRobot extends Robot {
    // RosieRobot class represents a robot that accept commands to move in four directions.
    // RosieRobot class follows the DRY principle now because code in common with UniblabRobot is in Robot class.
    // RosieRobot class has one more dependency to Robot class so coupling is higher.

    private Tuple<Integer, Integer> _currentPosition = new Tuple<Integer, Integer>(5, 5);

    public void MoveOneNorth() {
        _currentPosition = Add(_currentPosition, North);
    }

    public void MoveOneSouth() {
        _currentPosition = Add(_currentPosition, South);
    }

    public void MoveOneEast() {
        _currentPosition = Add(_currentPosition, East);
    }

    public void MoveOneWest() {
        _currentPosition = Add(_currentPosition, West);
    }
}

