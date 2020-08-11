class SubwayCard
  def initialize(sub_central)
    @subway_central= sub_central
  end
  def recharge(amount)
    @balance+=amount
  end
  def ride
    if can_ride
    extract_trip
  end
  end
end
