class Item
  include Comparable
  attr_writer 'units'
  attr_reader 'units'
  def initialize(product, units)
    @product , @units = product, units
  end
  def product
    @product
  end
    def total
    @product.unit_price * @units
  end
  def to_s
    "#{format('%-15s',@product.name)}\t#{@units}\t$#{format('%.2f',@product.unit_price)}"
  end
  def <=>(other)
    raise 'Error' unless other.is_a?(Item)
    total <=> other.total
  end
  def ==(other)
    other.is_a?(Item) && @product==other.product && @units == other.units
  end
  def hash
    [@product,@units].hash
  end

  def eql?(other)
  self.==(other)
  end
end
