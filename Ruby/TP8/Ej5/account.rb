class Account
  def initialize(id)
    @id=id
  end
  def deposit(amount)
    @balance+=amount
  end

  def extract(amount)
    if can_extract(amount)
    @balance-=amount
    end
    @balance
    end

  def to_s
    'Cuenta '+@id.to_s+ ' con saldo ' + @balance.to_s
  end

  def get_balance
    @balance
  end

end
