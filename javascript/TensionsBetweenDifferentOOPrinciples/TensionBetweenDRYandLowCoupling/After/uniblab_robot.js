var Robot = require("./robot.js");

// UniblabRobot class represents a robot that accept commands to move in four directions.
// UniblabRobot class follows the DRY principle now because code in common with RosieRobot is in Robot class.
// UniblabRobot class has one more dependency to Robot class so coupling is higher.
var UniblabRobot = function () {
  this.currentPosition = [5, 5];
};

UniblabRobot.prototype = Object.create(Robot.prototype);

UniblabRobot.prototype.moveOneNorthEast = function () {
  this.currentPosition = this.add(this.currentPosition, this.add(this.north, this.east));
};

UniblabRobot.prototype.moveOneNorthWest = function () {
  this.currentPosition = this.add(this.currentPosition, this.add(this.north, this.west));
};

UniblabRobot.prototype.moveOneSouthEast = function () {
  this.currentPosition = this.add(this.currentPosition, this.add(this.south, this.east));
};

UniblabRobot.prototype.moveOneSouthWest = function () {
  this.currentPosition = this.add(this.currentPosition, this.add(this.south, this.west));
};

module.exports = UniblabRobot;
