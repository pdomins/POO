require_relative 'class_a'
require_relative 'class_b'
require_relative 'class_c'
require_relative 'class_d'

a_class = A.new
#puts a_class.m_1 #5
#puts a_class.m_2 #10
#puts a_class.m_3 #5
#puts a_class.m_4 #loop inf
#puts a_class.m_5 #undefined method
#puts a_class.m_6 #undefined method
#puts a_class.m_7 #undefined method

#b_class = B.new
#puts b_class.m_1 #8
#puts b_class.m_2 #undefined method m_1 for 10(por que llamo a super que le devolvio m2 de A e intento aplicarle m1)
#puts b_class.m_3 #5
#puts b_class.m_4 #20
#puts b_class.m_5 #5
#puts b_class.m_6 #undefined method m_6 idem m2
#puts b_class.m_7 #super -> no superclass method m7

c_class = C.new
#puts c_class.m_1 #8
#puts c_class.m_2 #3
#puts c_class.m_3 #5
#puts c_class.m_4 #20
#puts c_class.m_5 #5
#puts c_class.m_6 #3
#puts c_class.m_7 #super: no superclass method `m_7

d_class = D.new
#puts d_class.m_1 #undefined method `m_3' for 8:Integer
#puts d_class.m_2 #undefined method `m_1' for 10:Integer
puts d_class.m_3 #2
puts d_class.m_4 #20
puts d_class.m_5 #20
#puts d_class.m_6 #undefined method `m_6'
#puts d_class.m_7 super: no superclass method `m_7'
