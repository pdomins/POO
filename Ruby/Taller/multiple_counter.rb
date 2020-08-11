require_relative 'count'

class MultipleCounter < Counter
  def initialize(times)
    super()
    @times = times
  end
  def increment
    aux = @times
    while aux>0
      super
      aux-=1
    end
  end
  def decrement
    @count+=@times
  end
end