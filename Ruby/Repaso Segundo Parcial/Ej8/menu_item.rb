require_relative 'menu'
class MenuItem < Menu

  def initialize(method_name, menu)
    super(method_name)
    @menu = menu
  end
  def access?(element)
     @menu.access?(element) ||  super(element)
  end
end
