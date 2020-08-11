class Product
  def initialize(name, price)
    @name, @unit_price = name, price
  end
  def name
    @name
  end
  def unit_price
    @unit_price
  end
  def ==(other)
    other.is_a?(Product) && @name==other.name && @unit_price == other.unit_price
  end
  def hash
    [@name,@unit_price].hash
  end
end
