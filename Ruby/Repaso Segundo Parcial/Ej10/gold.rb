require_relative 'mileage_plan'
class Gold < MileagePlan
  def initialize
    super(2000,1.1)
  end
end
