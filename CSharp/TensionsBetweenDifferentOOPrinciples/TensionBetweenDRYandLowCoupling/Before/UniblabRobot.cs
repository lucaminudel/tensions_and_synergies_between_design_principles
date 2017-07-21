using System;

namespace TensionBetweenDRYandLowCoupling.Before
{
    public class UniblabRobot
    {
		// UniblabRobot class represents a robot that accepts commands to move in four directions.
		// UniblabRobot class has no dependencies so it has a very low coupling or no coupling at all.
		// UniblabRobot class code is very similar to the RosieRobot class code so it violates the DRY principle.

		private Tuple<int, int> _currentPosition = new Tuple<int, int>(5, 5);

        public void MoveOneNorthEast()
        {
            var northEast = new Tuple<int, int>(1, 1);
            _currentPosition = NewPosition(northEast);
        }

        public void MoveOneNorthWest()
        {
            var northWest = new Tuple<int, int>(1, -1);
            _currentPosition = NewPosition(northWest);
        }

        public void MoveOneSouthEast()
        {
            var southEast = new Tuple<int, int>(-1, 1);
            _currentPosition = NewPosition(southEast);
        }

        public void MoveOneSouthWest()
        {
            var southWestst = new Tuple<int, int>(-1, -1);
            _currentPosition = NewPosition(southWestst);
        }

        private Tuple<int, int> NewPosition(Tuple<int, int> move)
        {
            var newPosition = new Tuple<int, int>(_currentPosition.Item1 + move.Item1,
                                                  _currentPosition.Item2 + move.Item2);

            return newPosition;
        }
 
    }
}
