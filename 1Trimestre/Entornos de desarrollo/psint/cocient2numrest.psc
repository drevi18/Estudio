Algoritmo cocient2numrest
	Escribir "1 num"
	leer n1
	Escribir "2 num"
	leer n2
	cont<-0
	Mientras n1>=n2 hacer 
		cont=cont+1
		n1=n1-n2
	FinMientras
	Escribir cont
FinAlgoritmo
