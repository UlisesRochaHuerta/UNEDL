﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RecorridodeMatriz //namespace es el nombre de el proyecto
{
    class Program 
    {
        static void Main(string[] args)
        {
            //int[][] matriz = new int[6][6];
            int[,] matriz = new int[6, 6];
            

            matriz[1][1] = -9; matriz[1][2] = -9; matriz[1][3] = -9; matriz[1][4] = 1; matriz[1][5] = 1; matriz[1][6] = 1;
            matriz[2][1] = 0; matriz[2][2] = -9; matriz[2][3] = 0; matriz[2][4] = 4; matriz[2][5] = 3; matriz[2][6] = 2;
            matriz[3][1] = -9; matriz[3][2] = -9; matriz[3][3] = -9; matriz[3][4] = 1; matriz[3][5] = 2; matriz[3][6] = 3;
            matriz[4][1] = 0; matriz[4][2] = 0; matriz[4][3] = 8; matriz[4][4] = 6; matriz[4][5] = 6; matriz[4][6] = 0;
            matriz[5][1] = 0; matriz[5][2] = 0; matriz[5][3] = 0; matriz[5][4] = -2; matriz[5][5] = 0; matriz[5][6] = 0;
            matriz[6][1] = 0; matriz[6][2] = 0; matriz[6][3] = 1; matriz[6][4] = 2; matriz[6][5] = 4; matriz[6][6] = 0;
            
            Console.WriteLine("  ", (matriz[1][1]) + (matriz[1][2]) + (matriz[1][3]) + (matriz[2][2]) + (matriz[3][1]) + (matriz[3][2]) + (matriz[3][3]));
        }
    }
}
