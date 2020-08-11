require_relative 'stack'
require_relative 'access_stack'

stack =Stack.new
stack.push(2)
stack.push(3)
puts stack.peek # 3
puts stack.pop # 3
puts stack.empty?# false
puts stack.pop # 2
puts stack.empty?# true
##puts stack.pop # Stack is empty (RuntimeError)
stack =AccessStack.new
stack.push(2)
stack.push(3)
stack.push(2)
puts stack.peek # 2
puts stack.pop # 2
puts stack.empty?# false
puts stack.pop # 3
puts stack.push_accesses # 3
puts stack.pop_accesses # 2
