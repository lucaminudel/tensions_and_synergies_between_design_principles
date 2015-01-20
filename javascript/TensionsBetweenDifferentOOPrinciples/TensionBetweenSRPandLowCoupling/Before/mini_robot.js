// MiniRobot class represents a plateau with well defined boundaries *and* represent a robot that
// accept commands to move in four directions inside the plateau.
// So MiniRobot class violates the Single Responsibility Principle (SRP) while it has no dependencies to other
// classes so it has low coupling.
var MiniRobot = function () {
  var plateau = [11, 13];

  this.currentPosition = [5, 5];

  this.newPosition = function (move) {
    var newPosition = [this.currentPosition[0] + move[0], this.currentPosition[1] + move[1]];

    if ((newPosition[0] < 0 || plateau[0] < newPosition[0]) ||
        (newPosition[1] < 0 || plateau[1] < newPosition[1]))
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
