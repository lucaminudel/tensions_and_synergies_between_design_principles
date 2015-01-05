using System;
using System.Collections.Generic;

namespace TensionBetweenSRPandEncapsulation.Before
{
    public class GuidedTourGroups
    {
        // GuidedTourGroups class represents a Guided Tour and also Groups of tourists joining the tour.
        // So GuidedTourGroups class violates the Single Responsibility Principle (SRP).
 
        private const int GuidedTourMaxSize = 30;
        private int _guidedTourGoupsSize = 0;

        private readonly List<Tuple<int, string, string>> _groups = new List<Tuple<int, string, string>>();

        public void AddGroupToTheGuidedTour(int size, string contactDetails, string billingAddress)
        {
            if (0 >= size) throw new ArgumentOutOfRangeException("size");
            if (string.IsNullOrWhiteSpace(contactDetails)) throw new ArgumentOutOfRangeException("contactDetails");
            if (string.IsNullOrWhiteSpace(billingAddress)) throw new ArgumentOutOfRangeException("billingAddress");

            if (_guidedTourGoupsSize + size > GuidedTourMaxSize)
                throw new ArgumentException("Group size exceeded guided tour's vacancies", "size");

            _groups.Add(new Tuple<int, string, string>(size, contactDetails, billingAddress));
            _guidedTourGoupsSize += size;
        }

        // Other public methods related to groups omitted for brevity

        // Other public methods related to guided tour omitted for brevity
    }
}
