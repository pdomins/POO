require_relative 'rectangle'
require_relative 'circle'

my_rectangle = Rectangle.new(Point.new(0,0), Point.new(2,4))
puts my_rectangle == Rectangle.new(Point.new(0,0),Point.new(2,4))
my_circle = Circle.new(Point.new(0,0),3)
puts my_circle == Circle.new(Point.new(0,0),3)
puts my_rectangle ==(my_circle)