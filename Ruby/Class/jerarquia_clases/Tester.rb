require_relative 'claseA'
require_relative 'claseB'
require_relative 'claseC'
clase_a = ClaseA.new

puts clase_a.m_1
puts clase_a.m_2
puts clase_a.m_3

clase_b = ClaseB.new
puts clase_b.m_1
# puts clase_b.m_2 No Method Error
puts clase_b.m_3

clase_c = ClaseC.new

puts clase_c.m_1
puts clase_c.m_2
puts clase_c.m_3