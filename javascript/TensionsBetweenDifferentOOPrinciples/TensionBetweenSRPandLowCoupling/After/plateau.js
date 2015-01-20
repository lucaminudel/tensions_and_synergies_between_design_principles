// Plateau class represents a plateau with well defined boundaries.
// So Plateau class follows the Single Responsibility Principle (SRP).
var Plateau = function () {
  this.plateau = [11, 13];
};

Plateau.prototype.contains = function (position) {
  return ((0 <= position[0] && position[0] <= this.plateau[0]) &&
      (0 <= position[1] && position[1] <= this.plateau[1]));
};

module.exports = Plateau;
