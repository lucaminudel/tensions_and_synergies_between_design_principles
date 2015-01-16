require_relative 'plateau'

module TensionBetweenSRPandLowCoupling
  module After
    class MiniRobot
      # MiniRobot class now represents only a robot that accept commands to move in four directions inside the plateau.
      # So MiniRobot class follows the Single Responsibility Principle (SRP) while it has an additional dependency to 
      # the Plateau class. Because of it, coupling in higher.

      def initialize
        @plateau = Plateau.new
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
                   @current_position.last + move.last]

        if !@plateau.contains(new_pos)
          raise InvalidOperationException.new("Tentative to move outside plateau boundaries");
        end

        new_pos
      end
    end
  end
end

class InvalidOperationException < StandardError ; end
