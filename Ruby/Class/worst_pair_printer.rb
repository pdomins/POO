@i = 0
while @i <= 100
  if @i % 2 == 0
    puts @i
  end
  @i+=1
end

(1..100).each{|v| puts v unless v.even?}
