using System;

namespace TensionBetweenDRYandLowCoupling.After
{
    public class RosieRobot : Robot
    {
		// RosieRobot class represents a robot that accepts commands to move in four directions.
		// RosieRobot class follows the DRY principle now because code in common with UniblabRobot is in Robot class.
		// RosieRobot class has one more dependencies to Robot class, so coupling is higher.
		// Sometimes this coupling in called 'subclass coupling' or, more in general, a 'dependency'.

		private Tuple<int, int> _currentPosition = new Tuple<int, int>(5, 5);
        
        public void MoveOneNorth()
        {
            _currentPosition = Add(_currentPosition, North);
        }

        public void MoveOneSouth()
        {
            _currentPosition = Add(_currentPosition, South);
        }

        public void MoveOneEast()
        {
            _currentPosition = Add(_currentPosition, East);
        }

        public void MoveOneWest()
        {
            _currentPosition = Add(_currentPosition, West);
        }
    }
}
