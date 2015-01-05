using System;

namespace TensionBetweenSRPandLowCoupling.After
{
    public class MiniRobot
    {
        // MiniRobot class now represents only a robot that accept commands to move in four directions inside the plateau.
        // So MiniRobot class follows the Single Responsibility Principle (SRP) while it has an additional dependency to 
        // the Plateau class. Because of it, coupling in higher.

        private readonly Plateau _plateau = new Plateau();

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

            if (!_plateau.Contains(newPosition))
                throw new InvalidOperationException("Tentative to move outside plateau boundaries");

            return newPosition;
        }
    }
}
