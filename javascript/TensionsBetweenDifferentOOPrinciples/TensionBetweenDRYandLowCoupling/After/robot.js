var Robot = function () {};

Robot.prototype.north = [1, 0];
Robot.prototype.south = [-1, 0];
Robot.prototype.east = [0, 1];
Robot.prototype.west = [0, -1];

Robot.prototype.add = function (a, b) {
  return [a[0] + b[0], a[1] + b[1]];
};

module.exports = Robot;
