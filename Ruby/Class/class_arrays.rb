require 'set'
a = Array[10]
a[0] = 1
a[1] = 2
a[5] = 19
a[9] = 10

b=[1,-2,3,-4]
c=b.map { |e| e>0? true:false }
p c

d=a.map { |e| e.nil? ? 0: e}
p d

