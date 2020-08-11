require_relative 'product'
require_relative 'item'
require 'set'

class Ticket

  NUMERATION_START=1000
  @@numeration = NUMERATION_START

  def initialize
    @id = Ticket.get_and_increment
    @items = Hash.new
  end

  def self.get_and_increment
    aux = @@numeration
    @@numeration +=1
    aux
  end

  def add(product, units)
    @items[product.name]= Item.new(product,0) unless @items.key?product.name
    @items[product.name].units += units
  end
  def to_s
    s = "TICKET N #{@id}\n"
    s += "#####################\n"
    @items.values.sort.each { |item| s+= "#{item}\n"}
    s += "#####################\n"
    s += "TOTAL $#{format('%.2f',total)}"
  end

  def total
    @items.values.map { |items| items.total }.reduce(:+)
  end
end
