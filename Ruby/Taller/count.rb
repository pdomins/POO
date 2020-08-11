class Counter

  def initialize
    @count = 0
  end
  def increment
    @count+=1
  end
  def decrement
    @count-=1
  end
  def count
    @count
  end
  def count=(var)
    @count = var
  end
  def to_s
    @count.to_s
  end
end


