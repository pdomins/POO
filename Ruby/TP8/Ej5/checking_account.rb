require_relative 'account'
class CheckingAccount < Account

  def initialize(id, overdraft)
    super(id)
    @overdraft=overdraft
    @balance = 0
  end

  def can_extract(amount)
    @balance+@overdraft-amount>=0
  end

  def get_overdraft
    @overdraft
  end

end
