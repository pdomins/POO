class Item
  include Comparable
  def initialize(product, unit)
    @product , @units = product, unit
  end
  def product
    @product
  end
  def units
    @units
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
