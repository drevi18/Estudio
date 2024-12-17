Algoritmo ejer10
	
	Definir n1,n2, guard Como Entero
		Escribir "Escribe 1 num"
		leer n1
	Para  i Desde 1 Hasta 3 Con Paso 1 Hacer

		Escribir "Escribe otro num"
		Leer n2 
		Si n1>=n2 Entonces
			n1=n1
			n2=0
		SiNo
			n1=n2
			
		FinSi
		
	FinPara
	Escribir "El numero más mayor es ",n1
	
	
FinAlgoritmo
