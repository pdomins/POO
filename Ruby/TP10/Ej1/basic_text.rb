require_relative 'html_text'

class BasicText
  include HTMLText
  def initialize
    raise 'Abstract Class'
  end
  def to_s
    source
  end
end
