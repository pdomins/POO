require_relative 'plain_text'
require_relative 'bold_text'
require_relative 'italic_text'
require_relative 'link_text'

text = PlainText.new('Hola')
bold_text = BoldText.new(text)
italic_text = ItalicText.new(text)
puts bold_text
puts italic_text
bold_italic_text = BoldText.new(ItalicText.new(text))
puts bold_italic_text
text.content = 'ITBA'
puts bold_text
puts italic_text
puts bold_italic_text
link_text = LinkText.new(text)
link_bold_italic_text = LinkText.new(bold_italic_text)
bold_link_text = BoldText.new(link_text)
puts link_text
puts link_bold_italic_text
puts bold_italic_text
text.content ='Ejemplo'
puts link_bold_italic_text
puts bold_link_text