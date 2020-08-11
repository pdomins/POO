require_relative 'point'

my_point = Point.new(1,2)
puts my_point == my_point
puts my_point == Point.new(1,2)
puts my_point != Point.new(3,4)
puts my_point == 'Hola Mundo'