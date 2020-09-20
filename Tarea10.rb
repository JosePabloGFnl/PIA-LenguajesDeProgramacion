=begin
Nombre:Jose Pablo González Flores Matr.:1986677 Hora:V5
=end
print("Ingresa el total de elementos del vector: ")
n = gets().to_i
puts()
puts()
print("A=[")
for i in (1..n).step 1
  res=i**((2*i)-1)
print("#{res},")
end
puts("]")
