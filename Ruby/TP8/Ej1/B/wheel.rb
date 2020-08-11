class Wheel
  def initialize(rim, tire)
    @rim = rim
    @tire = tire
  end
  def diameter
    @diameter = @rim + 2 * @tire
  end
end
