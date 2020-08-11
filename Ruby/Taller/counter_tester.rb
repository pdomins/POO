require_relative 'count'
require_relative 'multiple_counter'

my_counter = Counter.new
puts my_counter.count
my_counter.increment
my_counter.count = 10
my_counter.increment
puts my_counter.count
puts my_counter
puts
double_counter = MultipleCounter.new(2)
puts double_counter
double_counter.increment
puts double_counter
double_counter.count = 10
double_counter.increment
puts double_counter.count