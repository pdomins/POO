require_relative 'rechargeable_subway_card'
class DiscountRechargeableSubwayCard < RechargeableSubwayCard
  def initialize(sub_central, discount)
    super(sub_central)
    @discount = discount
  end

  def can_ride
    amount = @subway_central.get_cost
    if  @balance-(amount-(amount*@discount))<0
      raise RuntimeError,'Not enough funds'
    end
    true
  end
  def extract_trip
    amount = @subway_central.get_cost
    @balance-=(amount-(amount*@discount))
  end
end