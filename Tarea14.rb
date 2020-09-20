=begin
Nombre:Jose Pablo González Flores Matr.:1986677 Hora:V5
=end
cont=0;
	letrero = "";

	puts("Ingresa el  numero de filas: ")
	fil = gets().to_i

	puts("Ingresa el numero de columnas: ")
	col = gets().to_i

	matriz= Array.new(fil){Array.new(col)}


		for i in (0..(fil-1)). step 1
			for j in (0..(col-1)).step 1
				puts("Ingresa el valor de la matriz [#{(i+1)}][ #{(j+1)}] :" )
				matriz[i][j]= gets().to_i
			end
		end

		puts("Ingresa el Numero a Buscar")
		buscar = gets().to_i

		for i in (0..(fil-1)). step 1
			for j in (0..(col-1)).step 1
				if(matriz[i][j]== buscar) then
						cont = cont + 1
				end
			end
		end


		if(cont==1) then
			puts("El numero que busco aparece  #{cont} vez en la matriz \n\n")
		elsif (cont > 1) then
			puts("El numero que busco aparece  #{cont}  veces en la matriz \n\n")
		else
			puts("El numero que busco NO se encuentra en la matriz \n\n")
		end

		puts("La matriz es: ")

		for i in (0..(fil-1)).step 1
			for j in (0..(col-1)).step 1
					letrero = letrero + matriz[i][j].to_s + " "
			end
			letrero = letrero + "\n"
		end

		puts(letrero)
