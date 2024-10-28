Algoritmo num100
	ig=0
	may=0
	men=0
	Para i<-0 Hasta 5 Con Paso 1 Hacer
		Escribir "Introduce un número"
		Leer n
	Si n==0 Entonces
		ig= ig+1
	SiNo Si n>0 Entonces
			may= may+1
		SiNo Si n<0 Entonces
				men= men +1
			FinSi
		FinSi
	FinSi
FinPara
	Escribir "iguales a 0 " ig
	Escribir "mayores a 0 " may
	Escribir "menores a 0 " men
FinAlgoritmo
