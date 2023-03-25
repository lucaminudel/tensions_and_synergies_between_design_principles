using System;

namespace GuidedTour
{
    public class GuidedTour
    {
        // GuidedTour class represents a Guided Tour.

        private const int GuidedTourMaxSize = 30;
        private int _guidedTourGoupsSize;

        public void AddGroup(Group groupWillingToJoinTheTour)
        {

            if (_guidedTourGoupsSize + groupWillingToJoinTheTour.Size > GuidedTourMaxSize)
                throw new ArgumentException("Group size exceeded guided tour's vacancies");

            _guidedTourGoupsSize += groupWillingToJoinTheTour.Size;
        }

        // Other public methods related to guided tour omitted for brevity
    }
}
