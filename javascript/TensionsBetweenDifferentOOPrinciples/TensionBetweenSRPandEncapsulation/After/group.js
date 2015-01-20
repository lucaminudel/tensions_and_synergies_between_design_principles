// Group class represents a group of tourists.
// So Group class follows the Single Responsibility Principle (SRP) and does not break Encapsulation.
var Group = function (size, contactDetails, billingAddress) {
  if (0 >= size) throw new RangeError("size");
  if (!contactDetails.length) throw new RangeError("contactDetails");
  if (!billingAddress.length) throw new RangeError("billingAddress");

  this.size = size;
  this.contactDetails = contactDetails;
  this.billingAddress = billingAddress;
};

// Other public methods related to Group omitted for brevity

module.exports = Group;
