v = [1,2,3,4,5]

class Array
  def reverseEach # no sirve hacer self.reverseEach
    e = Enumerator.new do |y|
      c = self.length-1
      loop do
        raise StopIteration if c < 0
        y << self[c]
        c-=1
      end
    end
  end
end

e = v.reverseEach

p e.next
v[3]=10
p e.next