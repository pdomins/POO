require_relative 'figure'
class Ellipse < Figure
  def initialize(center, mayor_dim, minor_dim)
    @center= center
    @mayor_dim = mayor_dim
    @minor_dim = minor_dim
    @rad1= @mayor_dim/2.0
    @rad2=@minor_dim/2.0
  end
  def to_s
    'Ellipse [Centro: '+@center.to_s+
        ', DMayor:'+@mayor_dim.to_s +
        ', Dmenor:'+@minor_dim.to_s+']'
  end
  def perimeter
    Math::PI*2*Math.sqrt((@rad1**2+@rad2**2)/2)
  end
  def area
    Math::PI*@rad1*@rad2
  end
end
