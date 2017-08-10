package tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandEncapsulation.after;

public class Group {
    // Group class represents a group of tourists.
    // So Group class follows the Single Responsibility Principle (SRP) and does not break Encapsulation.

    private int _size;
    private String _contactDetails;
    private String _billingAddress;

    public Group(int size, String contactDetails, String billingAddress) {
        if (0 >= size) throw new ArrayIndexOutOfBoundsException("size");
//            if (IsNullOrWhiteSpace(contactDetails)) throw new IllegalArgumentException("contactDetails");
//            if (IsNullOrWhiteSpace(billingAddress)) throw new IllegalArgumentException("billingAddress");

        _size = size;
        _contactDetails = contactDetails;
        _billingAddress = billingAddress;
    }

    // Other public methods related to Group omitted for brevity
}

