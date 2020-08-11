class Client
  attr_accessor :points,:charge

  def initialize(client_name)
    @client_name = client_name
    @points = 0
    @charge = 0
  end

end
