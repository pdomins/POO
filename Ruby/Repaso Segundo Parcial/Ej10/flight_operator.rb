class FlightOperator
  def initialize(flight_catalog)
    @flight_catalog = flight_catalog
  end
  def miles_status(member, airline)
    miles = member.get_miles(airline)
    return puts "#{member.name} no registra millas acumuladas en #{airline}" if miles.zero?
    puts "Millas de #{member.name} en #{airline}: #{miles}"
  end
  def buy_flight(flight_code, member)
    flight = @flight_catalog.get_flight(flight_code)
    return member.use_miles(flight) if member.enough_miles?(flight)
    member.add_miles(flight)
    flight.price
  end
end
