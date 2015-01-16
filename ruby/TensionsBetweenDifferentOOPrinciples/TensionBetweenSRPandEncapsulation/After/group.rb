module TensionBetweenSRPandEncapsulation
  module After
    class Group
      # Group class represents a group of tourists.
      # So Group class follows the Single Responsibility Principle (SRP) and does not break Encapsulation.

      attr_accessor :size, :contact_details, :billing_address

      def initialize(size, contact_details, billing_address)
        if 0 >= size
          raise RangeError.new("size")
        end
        if contact_details.to_s.length == 0
          raise RangeError.new("contact_details")
        end
        if billing_address.to_s.length == 0
          raise RangeError.new("billing_address")
        end

        self.size = size;
        self.contact_details = contact_details;
        self.billing_address = billing_address;
      end

      # Other public methods related to Group omitted for brevity
    end
  end
end
