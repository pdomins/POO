require 'set'
require_relative 'point'

point_set = Set.new
point_set.add(Point.new(1,2))
point_set.add(Point.new(3,4))
point_set.add(Point.new(1,2))
puts point_set
