require_relative 'complex_number'

first_complex = ComplexNumber.new(2,-1)
second_complex = ComplexNumber.new(3,0)
res_complex = first_complex+second_complex
##puts res_complex.real.to_s +'+'+res_complex.imaginary.to_s+'i'
puts res_complex.real.to_s + ' + ' + res_complex.imaginary.to_s+'i'