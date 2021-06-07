Algoritmo Ejercicio8
	
	Definir numA como Entero
	Definir salir como Caracter
	
	Repetir
		Escribir "Ingrese una letra: "
		Leer salir
		
		Repetir
			numA <- Aleatorio(1,100)
		Hasta Que numA MOD 5 = 0
		
		Si salir="S" O salir="s" Entonces
			Escribir ""
		SiNo
			Escribir numA
		Fin Si
		
	Hasta Que salir="S" O salir="s"
	
FinAlgoritmo
