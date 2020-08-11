class SubwayCentral

  def initialize(price)
    unless price.is_a?Numeric
      raise RuntimeError,"Invalid Ride Cost"
    end
    @price=price
  end

  def to_s
    "Central: Subway Central [$"+@price.to_s+"]"
  end

  def ride_cost(cost)
    @price=cost
  end

  def get_cost
      @price
  end

end
