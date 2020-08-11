require_relative 'format_text'
class BoldText < FormatText
  def initialize(content)
    super(content)
  end
  def source
    source_format('b','b')
  end
end
