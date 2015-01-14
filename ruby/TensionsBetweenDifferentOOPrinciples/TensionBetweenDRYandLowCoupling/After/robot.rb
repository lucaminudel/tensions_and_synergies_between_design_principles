module TensionBetweenDRYandLowCoupling
  module After
    class Robot
      protected

      North = [ 1,  0]
      South = [-1,  0]
      East  = [ 0,  1]
      West  = [ 0, -1]

      def add(a, b)
        [a.first + b.first, a.last + b.last]
      end
    end
  end
end
