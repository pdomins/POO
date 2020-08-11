my_array=[9,5,1,2,3,4,0,-1]
p my_array.size
p my_array.first
p my_array.last
p my_array[1]
p my_array[9]
p my_array[2..4]
p my_array[2...4]
p my_array[2,4]
p my_array[-3]
p my_array.first(4)
p my_array.drop(4)
p my_array.prepend(10,11)
p my_array.append(20,21)
p my_array.map{|e|e*3}
p my_array
p my_array.map{|e|e*3}.reduce{|sum,e|sum+e}
