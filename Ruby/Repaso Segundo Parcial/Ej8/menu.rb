class Menu
  def initialize(method_name)
    @method_name = method_name
    @authorized = Array.new
  end

  def authorize(element)
    @authorized.push(element) unless @authorized.include?(element)
  end

  def access?(element)
    @authorized.include?(element) || if_company(element)
  end
  def if_company(element)
    element.company.each do |company|
      return true if @authorized.include?(company)
    end
    false
  end
end
