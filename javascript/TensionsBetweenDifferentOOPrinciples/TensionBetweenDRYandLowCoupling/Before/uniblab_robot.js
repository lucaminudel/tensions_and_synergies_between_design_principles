// UniblabRobot class represents a robot that accept commands to move in four directions.
// UniblabRobot class has no dependencies so it has a very low coupling.
// UniblabRobot class code is very similar to the RosieRobot class code so it violates the DRY principle.
var UniblabRobot = function () {
  this.currentPosition = [5, 5];

  this.newPosition = function (move) {
    return [this.currentPosition[0] + move[0], this.currentPosition[1] + move[1]];
  };
};

UniblabRobot.prototype.moveOneNorthEast = function () {
  var northEast = [1, 1];
  this.currentPosition = this.newPosition(northEast);
};

UniblabRobot.prototype.moveOneNorthWest = function () {
  var northWest = [1, -1];
  this.currentPosition = this.newPosition(northWest);
};

UniblabRobot.prototype.moveOneSouthEast = function () {
  var southEast = [-1, 1];
  this.currentPosition = this.newPosition(southEast);
};

UniblabRobot.prototype.moveOneSouthWest = function () {
  var southWest = [-1, -1];
  this.currentPosition = this.newPosition(southWest);
};

module.exports = UniblabRobot;
