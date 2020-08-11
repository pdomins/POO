require_relative 'format_text'
class ItalicText < FormatText
  def initialize(content)
    super(content)
  end
  def source
    source_format('i','i')
  end
end

