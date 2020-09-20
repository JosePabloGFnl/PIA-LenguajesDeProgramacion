=begin
Nombre:Jose Pablo González Flores Matr.:1986677 Hora:V5
=end
puts("1.Dolar")
puts("2.Euro")
puts("3.Yen")
puts("4.Dolar Hong Kong")
x = gets().to_i
puts("Ingrese la cantidad de pesos que desee convertir")
n = gets().to_f
case x
when 1
puts("#{n*0.042} dólares")
when 2
puts("#{n*0.039} euros")
when 3
  puts("#{n*4.47} yen")
when 4
  puts("#{n*0.32} dolar honkongeano")
end
