class Bag
  def initialize
    @bag = Hash.new
  end
  def add(other)
    @bag[other]=0 unless @bag.has_key?(other)
    @bag[other]+=1
  end
  def size
    @bag.size
  end
  def to_s
    s = "{"
    @bag.each do |key, value|
      s += "#{key}=>#{value}, "
    end
    s.insert(-3,"}")
    s.delete_suffix(", ")
  end
  def count(other)
    @bag.fetch(other)
  end
  def delete(other)
    @bag[other] -=1
    return @bag.delete(other) unless @bag.fetch(other)>0

  end
end
