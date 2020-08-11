class FlightCatalog
  def initialize
    @flights = Hash.new
  end
  def add_flight(flight)
    @flights[flight.code]=flight
  end
  def get_flight(flight_code)
    @flights[flight_code]
  end
end
