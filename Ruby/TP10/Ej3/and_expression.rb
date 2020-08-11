require_relative 'binary_expression'

class AndExpression
  include BinaryExpression

  def evaluate
    @left_expression.evaluate && @right_expression.evaluate
  end
end

