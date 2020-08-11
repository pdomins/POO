require_relative 'wheel'
class Gear
  def initialize(chainring, cog, rim = 0, tire = 0)
    @chainring=chainring
    @cog=cog
    @my_wheel = Wheel.new(rim, tire)
  end
  def ratio
    @ratio=@chainring/@cog.to_f
  end
  def gear_inches
    diameter = @my_wheel.diameter
    self.ratio*diameter
  end
end
