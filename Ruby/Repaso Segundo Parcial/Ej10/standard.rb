require_relative 'mileage_plan'
class Standard < MileagePlan
  def initialize
    super(1000,1)
  end
end
