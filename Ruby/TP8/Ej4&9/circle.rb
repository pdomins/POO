require_relative 'ellipse'
class Circle < Ellipse
  def initialize(center, dim)
    super(center,dim*2,dim*2)
    @dim = dim
  end
  def to_s
    "Circle [Centro: #{@center}, Radio: #{@dim}]"
  end
  def ==(aux)
    aux.instance_of?(Circle) && perimeter==aux.perimeter && area==aux.area
  end
  def <=>(other)
    aux = self.perimeter<=>other.perimeter
    if aux == 0
      aux = self.area<=>other.area
    end
    aux
  end
  def hash
    [self.area,self.perimeter].hash
  end

  def eql?(other)
    (self<=>other)==0
  end
end
