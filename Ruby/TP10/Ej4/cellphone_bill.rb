require_relative 'call'
class CellPhoneBill
  attr_reader :to_number
  def initialize(number)
    @number, @calls = number, []
  end
  def register_call(to_number, duration)
    @calls.push(Call.new(@number, to_number, duration))
  end
  def process_bill
    @calls.map{|c| c.cost}.reduce(:+)
  end
end
