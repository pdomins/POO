class Point
  def initialize(x,y)
    @x = x
    @y = y
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
  def ==(aux)
    unless aux.is_a?Point
      raise RuntimeError,'Wrong parameter'
    end
    if @x == aux.get_x && @y == aux.get_y
      true
    end
    false
  end

  def inspect
    self.to_s
  end
  def to_s
    "{#{@x},#{@y}}"
  end
  def <=>(other)
    aux = @x<=>other.get_x
    if aux == 0
      return @y<=>other.get_y
    end
    aux
  end
  def eql?(other)
    (self<=>other)==(0)
  end
  def hash
    [@x,@y].hash
  end
end