using System;

namespace TensionBetweenSRPandEncapsulation.After
{
    public class Group
    {
        // Group class represents a group of tourists.
        // So Group class follows the Single Responsibility Principle (SRP) and does not break Encapsulation.

        private int _size;
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

        // Other public methods related to Group omitted for brevity
    }
}
