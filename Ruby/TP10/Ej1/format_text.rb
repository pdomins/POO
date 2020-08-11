require_relative 'basic_text'
class FormatText < BasicText

  def initialize(content)
    @content = content
  end

  def source_format(format_start, format_end)
    "<#{format_start}>#{@content}</#{format_end}>"
  end
end
