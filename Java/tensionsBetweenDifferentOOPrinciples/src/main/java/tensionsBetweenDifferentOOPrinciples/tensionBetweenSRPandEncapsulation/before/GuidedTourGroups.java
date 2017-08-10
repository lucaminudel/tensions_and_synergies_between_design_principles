package tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandEncapsulation.before;


import tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandEncapsulation.Tuple;

import java.util.ArrayList;
import java.util.List;

public class GuidedTourGroups {
    // GuidedTourGroups class represents a Guided Tour and also Groups of tourists joining the tour.
    // So GuidedTourGroups class violates the Single Responsibility Principle (SRP).

    private final static int GuidedTourMaxSize = 30;
    private int _guidedTourGoupsSize = 0;

    private final List<Tuple<Integer, String, String>> _groups = new ArrayList<Tuple<Integer, String, String>>();

    public void AddGroupToTheGuidedTour(int size, String contactDetails, String billingAddress) {
        if (0 >= size) throw new ArrayIndexOutOfBoundsException("size");

        if (IsNullOrWhiteSpace(contactDetails)) throw new IllegalArgumentException("contactDetails");
        if (IsNullOrWhiteSpace(billingAddress)) throw new IllegalArgumentException("billingAddress");

        if (_guidedTourGoupsSize + size > GuidedTourMaxSize)
            throw new IllegalArgumentException("Group size exceeded guided tour's vacancies");

        _groups.add(new Tuple<Integer, String, String>(size, contactDetails, billingAddress));
        _guidedTourGoupsSize += size;
    }

    // Other public methods related to groups omitted for brevity

    // Other public methods related to guided tour omitted for brevity


    private static boolean IsNullOrWhiteSpace(String value)
    {
        if (value == null)
            return true;

        for (int index = 0; index < value.length(); ++index)
        {
            if (!Character.isWhitespace((value.charAt(index))))
                return false;
        }
        return true;
    }

}

