var Robot = require("./robot.js");

// RosieRobot class represents a robot that accept commands to move in four directions.
// RosieRobot class follows the DRY principle now because code in common with UniblabRobot is in Robot class.
// RosieRobot class has one more dependency to Robot class so coupling is higher.
var RosieRobot = function () {
  this.currentPosition = [5, 5];
};

RosieRobot.prototype = Object.create(Robot.prototype);

RosieRobot.prototype.moveOneNorth = function () {
  this.currentPosition = this.add(this.currentPosition, this.north);
};

RosieRobot.prototype.moveOneSouth = function () {
  this.currentPosition = this.add(this.currentPosition, this.south);
};

RosieRobot.prototype.moveOneEast = function () {
  this.currentPosition = this.add(this.currentPosition, this.east);
};

RosieRobot.prototype.moveOneWest = function () {
  this.currentPosition = this.add(this.currentPosition, this.west);
};

module.exports = RosieRobot;
