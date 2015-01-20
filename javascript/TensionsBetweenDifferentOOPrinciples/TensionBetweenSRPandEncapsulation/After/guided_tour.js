var Group = require("./group.js");
var guidedTourMaxSize = 30;

// GuidedTour class represents a Guided Tour.
// So GuidedTour class follows the Single Responsibility Principle (SRP).
var GuidedTour = function () {
  this.guidedTourGroupsSize = 0;
};

GuidedTour.prototype.addGroup = function (groupWillingToJoinTheTour) {
  // How can you implement the possibility to add a group to the tour
  // without adding a getter for the size into Group class that would
  // weaken Group's encapsulation?

  // if (this.guidedTourGroupsSize + groupWillingToJoinTheTour.size > guidedTourMaxSize)
    throw new Error("Group size exceeded guided tour's vacancies");

  // this.guidedTourGroupsSize += groupWillingToJoinTheTour.size;
};

// Other public methods related to guided tour omitted for brevity

module.exports = GuidedTour;
