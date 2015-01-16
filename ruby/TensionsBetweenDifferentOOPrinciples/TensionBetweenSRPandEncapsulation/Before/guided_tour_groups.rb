module TensionBetweenSRPandEncapsulation
  module Before
    class GuidedTourGroups
      # GuidedTourGroups class represents a Guided Tour and also Groups of tourists joining the tour.
      # So GuidedTourGroups class violates the Single Responsibility Principle (SRP).

      GuidedTourMaxSize = 30

      def initialize
        @groups = []
        @guided_tour_groups_size = 0
      end

      def add_group_to_the_guided_tour(size, contact_details, billing_address)
        if 0 >= size
          raise RangeError.new("size")
        end
        if contact_details.to_s.length == 0
          raise RangeError.new("contact_details")
        end
        if billing_address.to_s.length == 0
          raise RangeError.new("billing_address")
        end
        if @guided_tour_groups_size + size > GuidedTourMaxSize
            raise ArgumentError.new("Group size exceeded guided tour's vacancies", "size")
        end

        @groups << [size, contact_details, billing_address]
        @guided_tour_groups_size += size
      end

      # Other public methods related to groups omitted for brevity
      # Other public methods related to guided tour omitted for brevity
    end
  end
end
