module TensionBetweenDRYandLowCoupling
  module Before
    class UniblabRobot
      # UniblabRobot class represents a robot that accept commands to move in four directions.
      # UniblabRobot class has no dependencies so it has a very low coupling.
      # UniblabRobot class code is very similar to the RosieRobot class code so it violates the DRY principle.

      def initialize
        @current_position = [5, 5]
      end

      def move_one_north_east
        north_east = [1, 1]
        @current_position = new_position north_east
      end

      def move_one_north_west
        north_west = [1, -1]
        @current_position = new_position north_west
      end

      def move_one_south_east
        south_east = [-1, 1]
        @current_position = new_position south_east
      end

      def move_one_south_west
        south_west = [-1, -1]
        @current_position = new_position south_west
      end

      private

      def new_position(move)
          [@current_position.first + move.first,
           @current_position.last + move.last]
      end
    end
  end
end
