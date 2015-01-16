module TensionBetweenDRYandLowCoupling
  module Before
    class RosieRobot
      # RosieRobot class represents a robot that accept commands to move in four directions.
      # RosieRobot class has no dependencies so it has a very low coupling.
      # RosieRobot class code is very similar to the UniblabRobot class code so it violates the DRY principle.
     
      def initialize
        @current_position = [5, 5]
      end
        
      def move_one_north
        north = [1, 0]
        @current_position = new_position(north)
      end

      def move_one_south
        south = [-1, 0]
        @current_position = new_position(south)
      end

      def move_one_east
        east = [0, 1]
        @current_position = new_position(east)
      end

      def move_one_west
        west = [0, -1]
        @current_position = new_position(west)
      end

      private

      def new_position(move)
        [@current_position.first + move.first, @current_position.last + move.last]
      end
    end
  end
end
