using System;

namespace TensionBetweenSRPandLowCoupling.After
{
    public class Plateau
    {
        // Plateau class represents a plateau with well defined boundaries.
        // So Plateau class follows the Single Responsibility Principle (SRP).

        private readonly Tuple<int, int> _plateau = new Tuple<int, int>(11, 13);

        public bool Contains(Tuple<int, int> position)
        {
            return ((0 <= position.Item1 || position.Item1 <= _plateau.Item1) ||
                    (0 <= position.Item2 || position.Item2 <= _plateau.Item2));
        }
    }
}
