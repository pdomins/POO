require_relative 'format_text'
class LinkText < FormatText
  def initialize(content)
    super(content)
  end
  def source
    source_format("a href: \"www.itba.edu.ar\"",'a')
  end
end


