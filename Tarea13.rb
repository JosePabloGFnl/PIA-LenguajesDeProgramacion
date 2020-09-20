=begin
Nombre:Jose Pablo González Flores Matr.:1986677 Hora:V5
=end
print("Ingrese de cuantos números desea el vector")
n= gets().to_i
s= Array.new(n)
co= 0
for i in(0...n).step 1
  print("Ingrese un valor")
  s[i] = gets().to_i
end
letrero = "A["
for i in(0...n).step 1
  letrero=letrero+s[i].to_s+" "
end
letrero = letrero +"]"
puts(letrero)
print("número a buscar ")
x=gets().to_i
for i in(0...n).step 1
  if(s[i]==x) then
    co=co+1
  end
end
print("El número seleccionado #{x} se repite #{co} veces.")
