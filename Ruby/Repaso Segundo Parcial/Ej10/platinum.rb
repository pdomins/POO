require_relative 'mileage_plan'
class Platinum < MileagePlan
  def initialize
    super(0, 1.25)
  end

  def has_max_miles?(miles_to_add)
    false
  end
end
