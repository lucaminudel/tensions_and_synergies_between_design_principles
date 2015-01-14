require_relative 'robot'

module TensionBetweenDRYandLowCoupling
  module After
    class RosieRobot < Robot
      # RosieRobot class represents a robot that accept commands to move in four directions.
      # RosieRobot class follows the DRY principle now because code in common with UniblabRobot is in Robot class.
      # RosieRobot class has one more dependency to Robot class so coupling is higher.
 
      def initialize
        @current_position = [5, 5]
      end
      
      def move_one_north
        @current_position = add @current_position, North
      end

      def move_one_south
        @current_position = add @current_position, South
      end

      def move_one_east
        @current_position = add @current_position, East
      end

      def move_one_west
        @current_position = add @current_position, West
      end
    end
  end
end
