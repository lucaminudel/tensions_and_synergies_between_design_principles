package tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.after;

import tensionsBetweenDifferentOOPrinciples.tensionBetweenDRYandLowCoupling.Tuple;

public class UniblabRobot extends Robot {
    // UniblabRobot class represents a robot that accepts commands to move in four directions.
    // UniblabRobot class follows the DRY principle now because code in common with RosieRobot is in Robot class.
    // UniblabRobot class has one more dependencies to Robot class, so coupling is higher.
    // Sometimes this coupling in called 'subclass coupling' or, more in general, a 'dependency'.

    private Tuple<Integer, Integer> _currentPosition = new Tuple<>(5, 5);

    public void MoveOneNorthEast() {
        _currentPosition = Add(_currentPosition, Add(North, East));
    }

    public void MoveOneNorthWest() {
        _currentPosition = Add(_currentPosition, Add(North, West));
    }

    public void MoveOneSouthEast() {
        _currentPosition = Add(_currentPosition, Add(South, East));
    }

    public void MoveOneSouthWest() {
        _currentPosition = Add(_currentPosition, Add(South, West));
    }

}

