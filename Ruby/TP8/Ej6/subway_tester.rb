require_relative 'subway_central'
require_relative 'rechargeable_subway_card'
require_relative 'fixed_subway_card'
require_relative 'discount_rechargeable_subway_card'

subway_central = SubwayCentral.new(7.5)
#subway_central2= SubwayCentral.new("Hello World!")

rechargeable_card = RechargeableSubwayCard.new(subway_central)
rechargeable_card.recharge(15)
rechargeable_card.ride
puts rechargeable_card
subway_central.ride_cost(8.00)
puts rechargeable_card
##rechargeable_card.ride
#
fixed_card = FixedSubwayCard.new(subway_central,3)
fixed_card.ride
fixed_card.ride
puts fixed_card
fixed_card.ride
#fixed_card.ride

discount_card = DiscountRechargeableSubwayCard.new(subway_central,0.5)
discount_card.recharge(10)
discount_card.ride
puts discount_card
