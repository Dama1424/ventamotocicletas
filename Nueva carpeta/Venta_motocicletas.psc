Algoritmo Venta_motocicletas
	Definir  A, C, D, E, sumamotos Como Entero
	Definir B Como Caracter
	Definir BC, MC, AC, captotal Como Real
	
    Escribir "Ingrese IDENTIFICACIÓN en número sin espacios ni puntos del Encargado de ventas del mes:"
	Leer A
    Escribir "Ingrese el NOMBRE DEL ENCARGADO de ventas del mes:"
	Leer B
	Escribir ""
	Escribir "Tenga en cuenta que las motocicletas se dividen en:"
	Escribir "BAJO CILINDRAJE que tienen un costo de 7000000"
	Escribir "MEDIO CILINDRAJE que tienen un costo de 13000000"
	Escribir "ALTO CILINDRAJE que tienen un costo de 20000000"
	Escribir ""
	Escribir "________________________________________________________________________"
	Escribir "¿cuántas motocicletas de BAJO CILINDRAJE se vendieron en el mes?"
	leer C
	BC = 7000000*c
    Escribir "El resultado es: ",BC
	Escribir "________________________________________________________________________"
	Escribir "¿cuántas motocicletas de MEDIO CILINDRAJE se vendieron en el mes?"
	leer D
	MC = 13000000*D
    Escribir "El resultado es: ",MC
	Escribir "_______________________________________________________________________"
	Escribir "¿cuántas motocicletas de ALTO CILINDRAJE se vendieron en el mes?"
	leer E
	AC = 20000000*E
    Escribir "El resultado es: ",AC
	Escribir "_______________________________________________________________________"
	
	sumamotos = C+D+E;
	captotal = BC+MC+AC;
	Escribir ""
	Escribir "************************************************************************"
	Escribir "************************************************************************"
	Escribir "El total de motocicletas vendidas es: ",sumamotos
	Escribir B " el encargado de venta de motocicletas del mes, con identificación ",A
	Escribir "entrega el total de motocicletas vendidas del mes de Junio"
	Escribir ""
	Escribir C " motocicleta de bajo cilindraje"
	Escribir D " motocicleta de medio cilindraje"
	Escribir E " motocicleta de alto cilindraje"
	Escribir ""
	Escribir "El promedio en capital de motocicletas vendidas es de: ",captotal
	Escribir BC " en motocicleta de bajo cilindraje"
	Escribir MC " en motocicleta de medio cilindraje"
	Escribir AC " en motocicleta de alto cilindraje"
	
FinAlgoritmo
