Algoritmo impnummespar
	cont<-0
	Escribir "mes"
	leer mes
	mientras mes<1 o mes>12 Hacer
	
		leer mes
	FinMientras
	mientras mes>=1 y mes<=12 Hacer
		cont<-cont+mes
		Si mes%2=0 Entonces
			Mientras cont<12 Hacer
				cont=cont+2
				Escribir "Meses pares: ",cont
			FinMientras
		SiNo
			mes=mes-1
			cont= cont-1
			Mientras cont<12 Hacer
				cont=cont+2
				Escribir "Meses pares: ",cont
			FinMientras
		FinSi
	FinMientras
		

	

FinAlgoritmo
