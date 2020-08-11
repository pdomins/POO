class Call
  COST_PER_SECOND = 0.01
  attr_reader :to
  def initialize(from, to, duration)
    @from, @to, @duration = from, to, duration
  end
  def cost
    @duration * COST_PER_SECOND
  end

end
