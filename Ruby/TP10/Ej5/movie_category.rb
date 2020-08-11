class MovieCategory
  attr_reader :genre,:day,:price,:tax

  def initialize(genre,day, price, tax)
    @genre,@day, @price, @tax = genre,day, price, tax
  end

  def get_price(days)
    total = @price
    total += (days-@day)*@tax unless days < @day
    total
    end
end
