require_relative 'subway_central'
require_relative 'subway_card'

class RechargeableSubwayCard < SubwayCard
  def initialize(sub_central)
    super(sub_central)
    @balance = 0
  end
  def can_ride
    if  @balance-@subway_central.get_cost<0
   raise RuntimeError,'Not enough funds'
    end
    true
  end
  def extract_trip
    @balance-=@subway_central.get_cost
  end
  def to_s
    "Rechargeable Subway Card ["+@subway_central.to_s+"][Balance: $"+@balance.to_s+"]"
  end
end
