class Lot

  def initialize(lot_number)
    @lot_number = lot_number
    @state = 'Available'
  end
  def lot_number
    @lot_number
  end
  def state
    @state
  end

  def change_state
    if @state == 'Reserved'
        @state = 'Available'
    else
        @state = 'Reserved'
    end
  end

  def to_s
    "##{@lot_number}: #{@state}"
  end
  def ==(other)
    other.is_a?(Lot) && lot_number==other.lot_number
  end
  def <=>(other)
    lot_number<=>other.lot_number
  end
  def hash
    [lot_number].hash
  end
  def is_free?
    @state == 'Available'
  end
end
