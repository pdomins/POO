require_relative 'expression'

class NotExpression
  include Expression

  def initialize(value)
    @value=value
  end

  def evaluate
    !@value.evaluate
  end
end
