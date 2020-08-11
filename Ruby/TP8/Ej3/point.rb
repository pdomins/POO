class Point
  def initialize(x,y)
    @x = x
    @y = y
  end
  def to_s
    '{'+@x.to_s+','+@y.to_s+'}'
  end
  def get_x
    @x
  end
  def get_y
    @y
  end
  def distance(aux)
    aux_x= (aux.get_x-@x)**(2)
    aux_y = (aux.get_y-@y)**(2)
    Math.sqrt(aux_x+aux_y)

  end
end