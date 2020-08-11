require_relative 'rectangle'
require_relative 'triangle'
require_relative 'ellipse'
require_relative 'circle'

start_point = Point.new(0,0)

my_rectangle = Rectangle.new(start_point, Point.new(2,4))
puts my_rectangle
puts my_rectangle.perimeter
puts my_rectangle.area

my_triangle = Triangle.new(start_point, Point.new(1,0),Point.new(0,1))
puts my_triangle
puts my_triangle.perimeter
puts my_triangle.area

my_ellipse = Ellipse.new(start_point, 2,1)
puts my_ellipse
puts my_ellipse.perimeter
puts my_ellipse.area

my_circle = Circle.new(start_point,3)
puts my_circle
puts my_circle.perimeter
puts my_circle.area