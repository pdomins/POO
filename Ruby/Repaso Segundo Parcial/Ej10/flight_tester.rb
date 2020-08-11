require_relative 'flight_catalog'
require_relative 'flight'
require_relative 'flight_operator'
require_relative 'member'
require_relative 'gold'
require_relative 'mileage_plan'
require_relative 'platinum'

flight_catalog = FlightCatalog.new

flight_catalog.add_flight(Flight.new('LA1', 'LATAM',200, 600))
flight_catalog.add_flight(Flight.new('LA2', 'LATAM',400, 3000))
flight_catalog.add_flight(Flight.new('LA3', 'LATAM',40, 200))
flight_catalog.add_flight(Flight.new('UA1', 'United',3500, 5000))

flight_operator = FlightOperator.new(flight_catalog)
juan = Member.new('Juan', Gold.new)
puts flight_operator.miles_status(juan, 'United')
puts flight_operator.miles_status(juan, 'LATAM')

puts flight_operator.buy_flight('UA1', juan)

puts flight_operator.miles_status(juan, 'United')
puts flight_operator.miles_status(juan, 'LATAM')
malena = Member.new('Malena', Platinum.new)
puts flight_operator.miles_status(malena, 'United')
puts flight_operator.miles_status(malena, 'LATAM')

puts flight_operator.buy_flight('UA1', malena)
puts flight_operator.buy_flight('LA1', malena)

puts flight_operator.miles_status(malena, 'United')
puts flight_operator.miles_status(malena, 'LATAM')

puts flight_operator.buy_flight('LA2', malena)

puts flight_operator.miles_status(malena, 'United')
puts flight_operator.miles_status(malena, 'LATAM')

puts flight_operator.buy_flight('LA3', malena)

puts flight_operator.miles_status(malena, 'United')
puts flight_operator.miles_status(malena, 'LATAM')



