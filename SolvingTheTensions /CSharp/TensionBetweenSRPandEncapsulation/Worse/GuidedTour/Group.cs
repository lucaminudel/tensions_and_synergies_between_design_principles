using System;

namespace GuidedTour
{
    public class Group
    {
        // Group class represents a group of tourists.

        public int Size { get; private set; }
        public string ContactDetails { get; private set; }
        public string BillingAddress { get; private set; }

        public Group(int size, string contactDetails, string billingAddress)
        {
            if (0 >= size) throw new ArgumentOutOfRangeException("size");
            if (string.IsNullOrWhiteSpace(contactDetails)) throw new ArgumentOutOfRangeException("contactDetails");
            if (string.IsNullOrWhiteSpace(billingAddress)) throw new ArgumentOutOfRangeException("billingAddress");

            Size = size;
            ContactDetails = contactDetails;
            BillingAddress = billingAddress;
        }

        // Other public methods related to Group omitted for brevity
    }
}
