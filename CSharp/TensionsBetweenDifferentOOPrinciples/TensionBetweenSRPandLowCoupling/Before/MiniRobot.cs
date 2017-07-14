

using System;

namespace TensionBetweenSRPandLowCoupling.Before
{
    public class MiniRobot
    {
        // MiniRobot class represents a plateau with well defined boundaries *and* represent a robot that 
        // accepts commands to move in four directions inside the plateau.
        // So MiniRobot class violates the Single Responsibility Principle (SRP), while it has no logical or 
        // physical dependencies to other classes, so it has a low coupling.
 
        private readonly Tuple<int, int> _plateau = new Tuple<int, int>(11, 13);
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

            if ((newPosition.Item1 < 0 || _plateau.Item1 < newPosition.Item1) ||
                (newPosition.Item2 < 0 || _plateau.Item2 < newPosition.Item2))
                throw new InvalidOperationException("Tentative to move outside plateau boundaries");

            return newPosition;
        }
    }
}
