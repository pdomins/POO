require_relative 'gear'

chainring = 52
cog = 11
my_gear = Gear.new(chainring,cog)
puts my_gear.ratio

my_gear.chainring=30
my_gear.cog=27
puts my_gear.ratio