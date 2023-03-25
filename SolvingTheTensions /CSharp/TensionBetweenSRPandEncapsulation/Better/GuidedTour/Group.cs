using System;

namespace GuidedTour
{
    class Group 
    {
        // Group class represents a group of tourists.

        private readonly int _size;
        private string _contactDetails;
        private string _billingAddress;

        public Group(int size, string contactDetails, string billingAddress)
        {
            if (0 >= size) throw new ArgumentOutOfRangeException("size");
            if (string.IsNullOrWhiteSpace(contactDetails)) throw new ArgumentOutOfRangeException("contactDetails");
            if (string.IsNullOrWhiteSpace(billingAddress)) throw new ArgumentOutOfRangeException("billingAddress");

            _size = size;
            _contactDetails = contactDetails;
            _billingAddress = billingAddress;
        }

        public void SubscribeTo(IEvent anEvent)
        {
            anEvent.Register(this, _size);

        }

        // Other public methods related to Group omitted for brevity
    }
}
