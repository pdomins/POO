require_relative 'html_text'
require_relative 'basic_text'
class PlainText < BasicText
  attr_writer :content

  def initialize(content)
    @content=content
  end
  def source
    @content
  end
end
