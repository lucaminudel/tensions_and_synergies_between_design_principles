var Plateau = require("./plateau.js");

// MiniRobot class now represents only a robot that accept commands to move in four directions inside the plateau.
// So MiniRobot class follows the Single Responsibility Principle (SRP) while it has an additional dependency to
// the Plateau class. Because of it, coupling in higher.
var MiniRobot = function () {
  var plateau = new Plateau();

  this.currentPosition = [5, 5];

  this.newPosition = function (move) {
    var newPosition = [this.currentPosition[0] + move[0], this.currentPosition[1] + move[1]];

    if (!plateau.contains(newPosition))
      throw new Error("Tentative to move outside plateau boundaries");

    return newPosition;
  };
};

MiniRobot.prototype.moveOneNorth = function () {
  var north = [1, 0];
  this.currentPosition = this.newPosition(north);
};

MiniRobot.prototype.moveOneSouth = function () {
  var south = [-1, 0];
  this.currentPosition = this.newPosition(south);
};

MiniRobot.prototype.moveOneEast = function () {
  var east = [0, 1];
  this.currentPosition = this.newPosition(east);
};

MiniRobot.prototype.moveOneWest = function () {
  var west = [0, -1];
  this.currentPosition = this.newPosition(west);
};

module.exports = MiniRobot;
