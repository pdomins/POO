class Member
  attr_reader :name
  def initialize(name, mileage_plan)
    @name = name
    @mileage_plan = mileage_plan
    @personal_miles = Hash.new {0}
  end
  def get_miles(airline)
    @personal_miles[airline]
  end
  def enough_miles?(flight)
    true if @personal_miles[flight.airline] >= flight.miles
  end
  def use_miles(flight)
    @personal_miles[flight.airline] -= flight.miles
  end
  def add_miles(flight)
    @personal_miles[flight.airline] = @mileage_plan.add_miles(flight.miles, @personal_miles[flight.airline])
  end
end
