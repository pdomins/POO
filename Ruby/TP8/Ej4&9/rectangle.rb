require_relative 'point'
require_relative 'figure'
class Rectangle < Figure
  def initialize(point1, point2)
    @point1=point1 ##izq inferior
    @point2=point2 ##der superior
    @base= (@point1.get_x - @point2.get_x).abs
    @height=( @point1.get_y - @point2.get_y).abs
  end
  def perimeter
    2*@base+2*@height
  end
  def area
    @base*@height
  end
  def to_s
    'Rectangle ['+@point1.to_s+','+@point2.to_s+']'
  end
  def ==(aux)
    aux.instance_of?(Rectangle) && area==aux.area && perimeter==aux.perimeter
  end
end
