class Flight
  attr_reader :code, :airline, :price, :miles

  def initialize(code, airline, price,miles)
    @code= code
    @airline = airline
    @price = price
    @miles = miles
  end
end
