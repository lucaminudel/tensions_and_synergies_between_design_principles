module TensionBetweenSRPandLowCoupling
  module Before
    class MiniRobot
      # MiniRobot class represents a plateau with well defined boundaries *and* represent a robot that 
      # accept commands to move in four directions inside the plateau.
      # So MiniRobot class violates the Single Responsibility Principle (SRP) while it has no dependencies to other
      # classes so it has low coupling.

      Plateau = [11, 13]

      def initialize
        @current_position = [5, 5]
      end

      def move_one_north
        north = [1, 0]
        @current_position = new_position north
      end

      def move_one_south
        south = [-1, 0]
        @current_position = new_position south
      end

      def move_one_east
        east = [0, 1]
        @current_position = new_position east
      end

      def move_one_west
        west = [0, -1]
        @current_position = new_position west
      end

      private def new_position(move)
          new_pos = [@current_position.first + move.first,
                     @current_position.last  + move.last]

          if ((new_position.first < 0 || Plateau.first < new_position.first) ||
              (new_position.last < 0 || Plateau.last < new_position.last))
              raise InvalidOperationException.new("Tentative to move outside plateau boundaries")
          end

          new_pos
      end
    end
  end
end

class InvalidOperationException < StandardError ; end
