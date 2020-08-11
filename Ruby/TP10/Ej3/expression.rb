module Expression
  def evaluate
    raise 'Not implemented'
  end
  def not
    NotExpression.new(self)
  end
  def or(expression)
    OrExpression.new(self, expression)
  end
  def and(expression)
    AndExpression.new(self, expression)
  end
end
