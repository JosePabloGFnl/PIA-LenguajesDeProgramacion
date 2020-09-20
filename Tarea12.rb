=begin
Nombre:Jose Pablo González Flores Matr.:1986677 Hora:V5
=end
print("Números de la serie: ")
n= gets().to_i
a=2
b=1
par=1
c=-3
cont_n=1
cont_p=1
for i in(0...n).step 1
  if(cont_n>3) then
    b=1
    cont_n=1
  end
  if(cont_p>par) then
    b=2
    cont_p=1
    par=par+1
  end
  if(b==1) then
    print("#{a},")
    a=a+2
    cont_p = cont_p+1
  else
    print("#{c},")
    c=c-2
    cont_n=cont_n+1
  end
end
