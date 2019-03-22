using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tarea2
{
    class Program
    {
        static void Main(string[] args){
            int numero = 56; // variable tipo entero
            double flotanteLargo = 56.77878; // variable tipo flotante largo
            float flotante = 2.9f; // variable tipo flotante corto
            char caracter = '9'; // Variable tipo carácter
            string cadena = "56"; // Variable tipo cadena
            object objeto = 45.25;

            //Console.Write("Ingresa un dato de tipo entero\n");
            //numero=Console.ReadLine();
            //Console.Write("el valor de tu ntero es:  ",numero);
            //Console.WriteLine("Tamaño de tipo de Dato int: {0}", sizeof(int));

            int MINIMO_VALOR = char.MinValue;
            int MAXIMO_VALOR = char.MaxValue;

            Console.Write("A CONTINUACION SE MUESTRAN LOS VALORES DE LOS TIPOS DE DATOS:\n");
                Console.Write("TIPO DE DATO      |||        VALOR                  |||\n");
                Console.Write("                  |||                               |||\n");
            Console.WriteLine("\n   ENTERO (int)   ||| [" + int.MinValue + " , " + int.MaxValue + "]");

            Console.WriteLine("\n   FLOTANTE(float)||| [" + float.MinValue + " , " + float.MaxValue + "]");
            
            Console.WriteLine("\n   CARACTER(char) ||| [" + MINIMO_VALOR + " , " + MAXIMO_VALOR + "]");

            Console.WriteLine("\n   (byte)         ||| [" + byte.MinValue + " , " + byte.MaxValue + "]");

            Console.WriteLine("\n   (short)        ||| [" + short.MinValue + " , " + short.MaxValue + "]");
            
            Console.WriteLine("\n   (long)         ||| [" + long.MinValue + " , " + long.MaxValue + "]");
            
            Console.WriteLine("\n   (decimal)      ||| [" + decimal.MinValue + " , " + decimal.MaxValue + "]");

            Console.WriteLine("\n   DOBLE(double)  ||| [" + double.MinValue + " , " + double.MaxValue + "]");

            Console.WriteLine("\n   BOLEANO(boolean)|| [" + bool.FalseString + " , " + bool.TrueString + "]");

            Console.Write("ULISES ISAAC ROCHA HUERTA   ||   4to A   ||   TURNO MATUTINO");


        }
    }
}
