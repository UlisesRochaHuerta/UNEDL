
#include "pch.h"
#include <iostream>

int main()
{
	float numero1,numero2,numero3,numero4;
	printf("\nINGRESE UN NUMERO(1) no menor que 25\n");
	scanf_s("%f", &numero1);
	while (numero1 < 25) {
		printf("\nError\nINGRESE UN NUMERO(1) no menor que 25\n");
		scanf_s("%f", &numero1);
	}
	printf("\nINGRESE UN NUMERO(2) no menor que 25 ni mayor que 35\n");
	scanf_s("%f", &numero2);
	while (numero2 < 25 || numero2>35) {
		printf("\nError\nINGRESE UN NUMERO(2) no menor que 25 ni mayor que 35\n");
		scanf_s("%f", &numero2);
	}
	printf("\nINGRESE UN NUMERO(3) no menor que 25 ni mayor que 50\n");
	scanf_s("%f", &numero3);
	while (numero3<25||numero3>50){
		printf("\nError\nINGRESE UN NUMERO(3) no menor que 25 ni mayor que 50\n");
		scanf_s("%f", &numero3);
	}
	printf("\nINGRESE UN NUMERO(4) no menor que 25 ni mayor que 30\n");
	scanf_s("%f", &numero4);
	while (numero4 < 25 || numero4>30) {
		printf("\nError\nINGRESE UN NUMERO(4) no menor que 25 ni mayor que 30\n");
		scanf_s("%f", &numero4);
	}



	printf("\n\n\n");
	printf("\nEl promedio de los 4 numeros que ingresaste es: %f",((numero1+numero2+numero3+numero4)/4)  );
	if (numero1&&numero2 > 25) {
		printf("\nLa suma del numero 1 + el numero 2 es igual a: %f",numero1+numero2  );
	}
	printf("\nEl numero 3 que tu ingresaste fue %f, y tu numero 3 dividido entre 2 es igual a : %f",numero3,numero3/2);
	for (int x=0; x < 3; x++) {
		printf("\nUtilizamos la estructura de control for %d vez.", x);
	}

	//>25
	//>25<35
	//>25<50
	//>25<30

	//+, -, *, /
	//<, >
	//  ||,  &&

}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar