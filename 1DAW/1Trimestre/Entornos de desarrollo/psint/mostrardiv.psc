Algoritmo mostrardiv
	Escribir "num"
	leer n1
	cont<-0
	div<-0
	Mientras cont<>n1 Hacer
		cont=cont+1
		Si n1%cont=0 entonces 
			div= cont
			Escribir "divisor de " n1 " es " div
		FinSi
	FinMientras
FinAlgoritmo
