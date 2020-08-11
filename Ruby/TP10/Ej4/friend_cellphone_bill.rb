require_relative 'cellphone_bill'
class FriendCellPhoneBill < CellPhoneBill
  DEFAULT_FRIEND_COST_PER_SECOND = 0
  def initialize(number, friends_limit)
    super(number)
    @friends = []
    @friends_limit = friends_limit
    @cost = DEFAULT_FRIEND_COST_PER_SECOND
  end

  def set_cost(cost)
    @cost = cost
  end
  def add_friend(number)
    raise 'Max number of friends reached' unless @friends.size < @friends_limit
    @friends.push(number) unless  contains_friend(number)
  end
  def contains_friend(number)
    @friends.include?(number)
  end
  def remove_friend(number)
    @friends.delete(number)
  end
  def process_bill
    @calls.map do |c|
     contains_friend(c.to)? (c.cost * @cost): c.cost
      end.reduce(:+)
  end
end

