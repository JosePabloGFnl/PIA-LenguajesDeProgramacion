=begin
Nombre:Jose Pablo González Flores Matr.:1986677 Hora:V5
=end
puts("1.°C -> °F")
puts("2.°F -> °C")
x = gets().to_i
puts("Ingrese el número que deseé convertir")
n = gets().to_f
case x
when 1
puts("#{(n*2-x/5)+32.0} grados Farenheit")
when 2
puts("#{(n-32.0)/1.8} grados Celcius")
end
