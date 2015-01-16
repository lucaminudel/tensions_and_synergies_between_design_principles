
package tensionsBetweenDifferentOOPrinciples.tensionBetweenSRPandEncapsulation.after;

public class GuidedTour {
    // GuidedTour class represents a Guided Tour.
    // So GuidedTour class follows the Single Responsibility Principle (SRP).

    private static final int GuidedTourMaxSize = 30;
    private int _guidedTourGoupsSize = 0;

    public void AddGroup(Group groupWillingToJoinTheTour) {
        // How can you implement the possibility to add a group to the tour
        // without adding a getter for the Size into Group class that would
        // weaken Group'sencapsulation ?

        //if (_guidedTourGoupsSize + groupWillingToJoinTheTour.size > GuidedTourMaxSize)
        throw new IllegalArgumentException("Group size exceeded guided tour's vacancies");

        //_guidedTourGoupsSize += groupWillingToJoinTheTour.size;
    }

    // Other public methods related to guided tour omitted for brevity
}

