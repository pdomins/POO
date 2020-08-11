require_relative 'cellphone_bill'
require_relative 'friend_cellphone_bill'

bill = FriendCellPhoneBill.new(111,3)
bill.add_friend(222)
bill.add_friend(444)
bill.add_friend(222)
bill.add_friend(444)
bill.add_friend(222)
bill.add_friend(444)
bill.add_friend(333)
bill.register_call(666,100)
bill.register_call(777,100)
bill.register_call(444,100)
bill.set_cost(0.5)
puts bill.process_bill
bill2 = CellPhoneBill.new(111)
bill2.register_call(000,100)
bill2.register_call(999,100)
puts bill2.process_bill
