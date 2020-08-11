require_relative 'company'
require_relative 'employee'
require_relative 'menu'
require_relative 'menu_item'

menu1 = Menu.new('File')
menu2 = MenuItem.new('New',menu1)
menu3 = MenuItem.new('Close', menu1)
menu4 = Menu.new('Help')
menu5 = MenuItem.new('About Us',menu4)
menu6 = MenuItem.new('Find..',menu4)

company1 = Company.new('ACME')
company2 = Company.new('Warner')
employee1 = Employee.new('James', [company1])
employee2 = Employee.new('Annie', [company1,company2])

menu1.authorize(employee1)
menu2.authorize(employee1)
menu5.authorize(employee1)
menu3.authorize(employee2)
menu4.authorize(company2)


[menu1, menu2, menu3, menu4, menu5, menu6].each { |menu| puts menu.access?(employee1) }
puts '###########'
[menu1, menu2, menu3, menu4, menu5, menu6].each { |menu| puts menu.access?(employee2) }
