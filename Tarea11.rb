=begin
Nombre:Jose Pablo González Flores Matr.:1986677 Hora:V5
=end
print("Números para la serie:")
n=gets().to_i
v=2
puts("")
for i in(1..n).step 1
  if(i%2==0) then
    for f in (1...v).step 1
      print("#{i},")
    end
    print("#{i}")
    v = v + 1
  else
    print("#{i*-1}")
  end
  if(i==n)then
    print(".")
  else
    print(",")
  end
end
puts("")
