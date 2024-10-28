Algoritmo parmayimpmen
	num<- 0
	par<-0
	imp<-0
	Para i<-1 hasta 10 Hacer
		Escribir "numero"
		leer num
		Si num%2=0 Entonces
			par=num+2
			imp= num-1
			Escribir "par mayor: ",par
			Escribir "imp men: ",imp
		SiNo 
			imp =num-2
			par=num+1
			Escribir "impar menor: ",imp
			Escribir "par mayor: ",par
		FinSi
	FinPara
FinAlgoritmo
