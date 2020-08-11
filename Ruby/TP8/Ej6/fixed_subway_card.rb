class FixedSubwayCard<SubwayCard
  def initialize(sub_central,trips_amount)
    super(sub_central)
    @trips_amount=trips_amount
  end
  def can_ride
    if @trips_amount<=0
      raise RuntimeError,"No rides Available"
    end
    true
  end
  def extract_trip
    @trips_amount-=1
  end

  def to_s
    "Fixed Subway Card ["+@subway_central.to_s+"][Rides: "+@trips_amount.to_s+"]"
  end
end
