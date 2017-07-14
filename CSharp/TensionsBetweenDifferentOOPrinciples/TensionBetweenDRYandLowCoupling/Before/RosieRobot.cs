using System;

namespace TensionBetweenDRYandLowCoupling.Before
{
    public class RosieRobot
    {
        // RosieRobot class represents a robot that accept commands to move in four directions.
        // RosieRobot class has no dependencies so it has a very low coupling or no coupling at all.
        // RosieRobot class code is very similar to the UniblabRobot class code so it violates the DRY principle.
 
        private Tuple<int, int> _currentPosition = new Tuple<int, int>(5, 5);
        
        public void MoveOneNorth()
        {
            var north = new Tuple<int, int>(1, 0);
            _currentPosition = NewPosition(north);
        }

        public void MoveOneSouth()
        {
            var south = new Tuple<int, int>(-1, 0);
            _currentPosition = NewPosition(south);
        }

        public void MoveOneEast()
        {
            var east = new Tuple<int, int>(0, 1);
            _currentPosition = NewPosition(east);
        }

        public void MoveOneWest()
        {
            var west = new Tuple<int, int>(0, -1);
            _currentPosition = NewPosition(west);
        }

        private Tuple<int, int> NewPosition(Tuple<int, int> move)
        {
            var newPosition = new Tuple<int, int>(_currentPosition.Item1 + move.Item1,
                                                  _currentPosition.Item2 + move.Item2);

            return newPosition;
        }
    }
}
