using System;

namespace TensionBetweenDRYandLowCoupling.After
{
    public class Robot
    {
        protected readonly Tuple<int, int> North = new Tuple<int, int>(1, 0);
        protected readonly Tuple<int, int> South = new Tuple<int, int>(-1, 0);
        protected readonly Tuple<int, int> East = new Tuple<int, int>(0, 1);
        protected readonly Tuple<int, int> West = new Tuple<int, int>(0, -1);

        protected Tuple<int, int> Add(Tuple<int, int> a, Tuple<int, int> b)
        {
            return new Tuple<int, int>(a.Item1 + b.Item1, a.Item2 + b.Item2);
        }
    }
}
