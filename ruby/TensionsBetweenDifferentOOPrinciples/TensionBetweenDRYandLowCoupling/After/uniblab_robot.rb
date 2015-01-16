require_relative 'robot'

module TensionBetweenDRYandLowCoupling
  module After
    class UniblabRobot < Robot
      # UniblabRobot class represents a robot that accept commands to move in four directions.
      # UniblabRobot class follows the DRY principle now because code in common with RosieRobot is in Robot class.
      # UniblabRobot class has one more dependency to Robot class so coupling is higher.

      def initialize
        @current_position = [5, 5]
      end

      def move_one_north_east
        @current_position = add @current_position, add(North, East)
      end

      def move_one_north_west
        @current_position = add @current_position, add(North, West)
      end

      def move_one_south_east
        @current_position = add @current_position, add(South, East)
      end

      def move_one_south_west
        @current_position = add @current_position, add(South, West)
      end
    end
  end
end
