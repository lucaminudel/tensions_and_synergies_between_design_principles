// RosieRobot class represents a robot that accept commands to move in four directions.
// RosieRobot class has no dependencies so it has a very low coupling.
// RosieRobot class code is very similar to the UniblabRobot class code so it violates the DRY principle.
var RosieRobot = function () {
  this.currentPosition = [5, 5];

  this.newPosition = function (move) {
    return [this.currentPosition[0] + move[0], this.currentPosition[1] + move[1]];
  };
};

RosieRobot.prototype.moveOneNorth = function () {
  var north = [1, 0];
  this.currentPosition = this.newPosition(north);
};

RosieRobot.prototype.moveOneSouth = function () {
  var south = [-1, 0];
  this.currentPosition = this.newPosition(south);
};

RosieRobot.prototype.moveOneEast = function () {
  var east = [0, 1];
  this.currentPosition = this.newPosition(east);
};

RosieRobot.prototype.moveOneWest = function () {
  var west = [0, -1];
  this.currentPosition = this.newPosition(west);
};

module.exports = RosieRobot;
