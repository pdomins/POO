require_relative 'expression'
require_relative 'simple_expression'
require_relative 'not_expression'
require_relative 'or_expression'
require_relative 'and_expression'

exp1 = SimpleExpression.new(true)
exp2 = SimpleExpression.new(false)
exp3 = exp1.not
exp4 = exp1.or(exp2)
exp5 = exp3.and(exp4)
p exp1.evaluate
p exp3.evaluate
p exp4.evaluate
p exp5.evaluate
exp1.value = false
p exp3.evaluate
p exp4.evaluate
p exp5.evaluate
exp2.value = true
p exp5.evaluate