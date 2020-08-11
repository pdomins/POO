require_relative 'parking_lot'

parking_lot = ParkingLot.new('EstacionARTE')
parking_lot.add_parking_space('A',1030)
parking_lot.add_parking_space('A',1000)
parking_lot.add_parking_space('A',1001)
parking_lot.add_parking_space('B',1001)

puts parking_lot.information
puts '###########'
begin
  parking_lot.park('Z',1001)
rescue RuntimeError => e
  puts e.message
end
puts '###########'
begin
  parking_lot.park('A',9999)
rescue RuntimeError => e
  puts e.message
end
puts '###########'
parking_lot.park('A',1001)
parking_lot.unpark('A',1001)
parking_lot.park('A',1001)

begin
  parking_lot.park('A',1001)
rescue RuntimeError => e
  puts e.message
end
puts '###########'
begin
  parking_lot.unpark('B',1001)
rescue RuntimeError => e
  puts e.message
end
puts '###########'
parking_lot.park('B',1001)
puts parking_lot.information


