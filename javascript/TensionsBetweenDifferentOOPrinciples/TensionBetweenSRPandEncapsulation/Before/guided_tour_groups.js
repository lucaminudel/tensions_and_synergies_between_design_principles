var guidedTourMaxSize = 30;

// GuidedTourGroups class represents a Guided Tour and also Groups of tourists joining the tour.
// So GuidedTourGroups class violates the Single Responsibility Principle (SRP).
var GuidedTourGroups = function () {
  this.groups = [];
  this.guidedTourGroupsSize = 0;
};

GuidedTourGroups.prototype.addGroupToTheGuidedTour = function (size, contactDetails, billingAddress) {
  if (0 >= size) throw new RangeError("size");
  if (!contactDetails.length) throw new RangeError("contactDetails");
  if (!billingAddress.length) throw new RangeError("billingAddress");

  if (this.guidedTourGroupsSize + size > guidedTourMaxSize)
    throw new Error("Group size exceeded guided tour's vacancies");

  this.groups.push([size, contactDetails, billingAddress]);
  this.guidedTourGroupsSize += size;
};

// Other public methods related to groups omitted for brevity

// Other public methods related to guided tour omitted for brevity

module.exports = GuidedTourGroups;
