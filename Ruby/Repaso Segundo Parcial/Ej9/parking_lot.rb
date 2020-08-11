require_relative 'lot'
class ParkingLot
  def initialize(name)
    @name = name
    @parking_spaces_by_level = Hash.new
  end

  def add_parking_space(level, lot)
    @parking_spaces_by_level[level] = Hash.new unless @parking_spaces_by_level.has_key?(level)
    @parking_spaces_by_level[level][lot] = Lot.new(lot)

  end
  def park(level,lot)
    raise 'Invalid Level' unless @parking_spaces_by_level.has_key?(level)
    raise 'Invalid Parking Space' unless @parking_spaces_by_level[level].has_key?(lot)
    raise 'Cannot Park Reserved Parking Space' unless @parking_spaces_by_level[level][lot].is_free?
    @parking_spaces_by_level[level][lot].change_state
  end
  def unpark(level, lot)
    raise 'Invalid Level' unless @parking_spaces_by_level.has_key?(level)
    raise 'Invalid Parking Space' unless @parking_spaces_by_level[level].has_key?(lot)
    raise 'Cannot Unpark Available Parking Space' if @parking_spaces_by_level[level][lot].is_free?
    @parking_spaces_by_level[level][lot].change_state
  end
  def information
    s = "Parking Lot #{@name}\n"
    @parking_spaces_by_level.keys.sort.each do |level|
      s += "Level #{level}\n"
      @parking_spaces_by_level[level].values.sort.each do |parking_space|
        s+= "#{parking_space}\n"
      end
    end
    s
  end
end
