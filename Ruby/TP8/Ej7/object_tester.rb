a = String.new('Hola Mundo')
b = String.new('Hola Mundo')
puts a == b #true
puts a === b #true
puts a.eql?b #true
puts a.equal?b #false
puts a<=>b #0 -> son iguales
