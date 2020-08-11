require 'set'

class Company

  def initialize(name)
    @name = name
  end

  def name
    @name
  end

  def ==(other)
    other.is_a?(Company) && @name==other.name
  end
  def to_s
    @name
  end

end
