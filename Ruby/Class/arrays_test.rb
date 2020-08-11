require'set'
v=[1,2,3]
w=[1,1,1,2,3,3,2,2]

class Array
  def same_elems(other)
    (self-other).empty? == (other-self).empty?
  end
  def same_set_elems(other)
    self.to_set == other.to_set
  end
end
puts v.same_elems(w)
puts v.same_set_elems(w)