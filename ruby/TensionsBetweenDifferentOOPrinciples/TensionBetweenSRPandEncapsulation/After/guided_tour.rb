require_relative 'group'

module TensionBetweenSRPandEncapsulation
  module After
    class GuidedTour
      # GuidedTour class represents a Guided Tour.
      # So GuidedTour class follows the Single Responsibility Principle (SRP).

      GuidedTourMaxSize = 30

      def initialize
         @guided_tour_groups_size = 0
      end

      def add_group(group_willing_to_join_the_tour)
        # How can you implement the possibility to add a group to the tour
        # without adding a getter for the Size into Group class that would
        # weaken Group's encapsulation ?

        #if (@guided_tour_groups_size + group_willing_to_join_the_tour.size > GuidedTourMaxSize)
          raise ArgumentError.new("Group size exceeded guided tour's vacancies")
        #end

        #@guided_tour_groups_size += group_willing_to_join_the_tour.size
      end

      # Other public methods related to guided tour omitted for brevity
    end
  end
end
