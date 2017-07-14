using System;
using System.Collections.Generic;

namespace TensionBetweenSRPandEncapsulation.After
{
    public class GuidedTour
    {
        // GuidedTour class represents a Guided Tour.
        // So GuidedTour class follows the Single Responsibility Principle (SRP).

        private const int GuidedTourMaxSize = 30;
        private int _guidedTourGoupsSize = 0;

		private readonly List<Group> _groups = new List<Group>();

        public void AddGroup(Group groupWillingToJoinTheTour)
        {
            // How can you implement the possibility to add a group to the tour
            // without adding a getter for the Size into Group class that would
            // weaken Group'sencapsulation ?

            //if (_guidedTourGoupsSize + groupWillingToJoinTheTour.size > GuidedTourMaxSize)
                throw new ArgumentException("Group size exceeded guided tour's vacancies");

			//_guidedTourGoupsSize += groupWillingToJoinTheTour.size;


			_groups.Add(groupWillingToJoinTheTour);
			
            // Secondarely, how can you implement the possibility to use groups' 
			// contact details and billing address, again without adding more getters 
			// into Group class that would weaken Group'sencapsulation ?
		}

        // Other public methods related to guided tour omitted for brevity
    }
}
