=begin
Nombre:Jose Pablo González Flores Matr.:1986677 Hora:V5
=end

suma = 0

  begin

    puts("Numero de filas de la primera matriz: ")
    fil1 = gets().to_i

    puts("Numero de columnas de la primera matriz: ")
    col1 = gets().to_i

    matriz1 = Array.new(fil1){Array.new(col1)}


    puts("Numero de filas de la segunda matriz: ")
    fil2 = gets().to_i

    puts("Numero de columnas de la segunda matriz: ")
    col2 = gets().to_i

    matriz2 = Array.new(fil2){Array.new(col2)}

  end while(fil1 != fil2 || col1 != col2)


  for i in (0..(fil1-1)). step 1
    for j in (0..(col1-1)).step 1
      puts("Ingresa el valor de la primera matriz [#{(i+1)}][ #{(j+1)}] :" )
      matriz1[i][j]= gets().to_i
    end
  end

  for i in (0..(fil2-1)). step 1
    for j in (0..(col2-1)).step 1
      puts("Ingresa el valor de la segunda matriz [#{(i+1)}][ #{(j+1)}] :" )
      matriz2[i][j]= gets().to_i
    end
  end

  letrero= ""
  multiplicacion = Array.new(fil1){Array.new(col1)}

  puts("Matriz A * B es: \n")

  for i in (0..(fil1-1)).step 1
    for j in (0..(col1-1)).step 1
      suma = 0
      for k in (0..(col1-1)). step 1
        suma += matriz1[i][k] * matriz2[k][j]
      end
      multiplicacion[i][j] = suma
      letrero = letrero + multiplicacion[i][j].to_s + " "
    end
    letrero= letrero + "\n"
  end

  puts(letrero)
