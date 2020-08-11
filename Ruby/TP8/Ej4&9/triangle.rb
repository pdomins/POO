require_relative 'figure'
class Triangle < Figure
  def initialize(point1, point2, point3)
    @point1= point1 ##inf izq
    @point2=point2 ##inf der
    @point3=point3 ##punta
    @base = (@point3.get_x-@point2.get_x).abs
    @height=(@point3.get_y-@point1.get_y).abs
    @side1= point1.distance(point3)
    @side2=point3.distance(point2)
  end
  def area
    @base*@height/2.0
  end
  def perimeter
    @base+@side2+@side1
  end
  def to_s
    'Triangle ['+@point1.to_s+','+@point2.to_s+','+@point3.to_s+']'
  end
end
