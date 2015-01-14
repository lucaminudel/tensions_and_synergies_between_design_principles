module TensionBetweenSRPandLowCoupling
  module After
    class Plateau
      # Plateau class represents a plateau with well defined boundaries.
      # So Plateau class follows the Single Responsibility Principle (SRP).

      def initialize
        @plateau = [11, 13]
      end

      def contains(position)
        ((0 <= position.first || position.first <= @plateau.first) ||
        (0 <= position.last || position.last <= @plateau.last))
      end
    end
  end
end
