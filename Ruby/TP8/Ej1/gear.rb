class Gear
  def initialize(chainring, cog)
    @chainring=chainring
    @cog=cog
  end
  def ratio
    @ratio=@chainring/@cog.to_f
  end
  def chainring=(aux)
    @chainring = aux
  end
  def cog=(aux)
    @cog = aux
  end
end
