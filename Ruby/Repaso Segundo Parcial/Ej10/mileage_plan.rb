class MileagePlan
  attr_reader :max_miles
  def initialize(max_miles, multiplier)
    @max_miles = max_miles
    @multiplier = multiplier
  end
  def add_miles(flight_miles, member_miles)
    miles_to_add = @multiplier * flight_miles + member_miles
    return @max_miles if has_max_miles?(miles_to_add)
    miles_to_add
  end
  def has_max_miles?(miles_to_add)
    @max_miles < miles_to_add
  end
end
