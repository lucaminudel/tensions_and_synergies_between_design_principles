using System;
using System.Collections;

namespace GuidedTour
{
    class GuidedTour : IEvent
    {
        // GuidedTour class represents a Guided Tour.

        private const int GuidedTourMaxSize = 30;
        private int _guidedTourGoupsSize;
        private readonly IList _attendees = new ArrayList();

        public void Register(Group attendee, int size)
        {
            if (_guidedTourGoupsSize + size > GuidedTourMaxSize)
                throw new ArgumentException("Group size exceeded guided tour's vacancies");

            _guidedTourGoupsSize += size;
            _attendees.Add(attendee);
        }

        // Other public methods related to guided tour omitted for brevity
    }
}
