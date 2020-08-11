require_relative 'gear'

rim = 26
tire = 1.5
puts Gear.new(52,11,rim,tire).gear_inches
rim = 24
tire = 1.25
puts Gear.new(52,11,rim,tire).gear_inches
puts Gear.new(52,11).ratio
