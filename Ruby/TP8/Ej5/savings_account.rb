require_relative 'account'
class SavingsAccount < Account
  def initialize(id)
    super(id)
    @balance=0
  end
  def can_extract(amount)
    if @balance-amount<0
      raise RuntimeError
    end
    true
  end

  end
