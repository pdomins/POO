require_relative 'expression'
module BinaryExpression
  include Expression

  def initialize(left_expression, right_expression)
    @left_expression, @right_expression = left_expression, right_expression
  end

  def evaluate
    raise 'Overwrite method'
  end
end