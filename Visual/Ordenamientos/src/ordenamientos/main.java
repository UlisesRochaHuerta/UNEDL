package ordenamientos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author Ulises
 */
public class main extends javax.swing.JFrame {
public int N1=1,N2=1,N3=1,N4=1,N5=1,N6=1,N7=1,N8=1,N9=1,N10=1;
public String d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n1 = new javax.swing.JTextField();
        n10 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        n6 = new javax.swing.JTextField();
        n7 = new javax.swing.JTextField();
        n8 = new javax.swing.JTextField();
        n9 = new javax.swing.JTextField();
        lbl_Inferior = new javax.swing.JLabel();
        lbl_Superior = new javax.swing.JLabel();
        Heap_Sort = new javax.swing.JToggleButton();
        Bubble_Sort = new javax.swing.JToggleButton();
        Quick_Sort = new javax.swing.JToggleButton();
        Merge_Sort = new javax.swing.JToggleButton();
        btnAlmacenar = new javax.swing.JButton();
        res1 = new javax.swing.JTextField();
        res2 = new javax.swing.JTextField();
        res3 = new javax.swing.JTextField();
        res4 = new javax.swing.JTextField();
        res5 = new javax.swing.JTextField();
        res6 = new javax.swing.JTextField();
        res7 = new javax.swing.JTextField();
        res8 = new javax.swing.JTextField();
        res9 = new javax.swing.JTextField();
        res10 = new javax.swing.JTextField();
        clean = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa de Ordenamiento de Datos Basado en los 4 Metodos de Ordenamiento");
        setMaximumSize(new java.awt.Dimension(615, 417));
        setMinimumSize(new java.awt.Dimension(615, 417));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(n1);
        n1.setBounds(130, 40, 60, 40);
        getContentPane().add(n10);
        n10.setBounds(410, 100, 60, 40);
        getContentPane().add(n2);
        n2.setBounds(200, 40, 60, 40);
        getContentPane().add(n3);
        n3.setBounds(270, 40, 60, 40);
        getContentPane().add(n4);
        n4.setBounds(340, 40, 60, 40);
        getContentPane().add(n5);
        n5.setBounds(410, 40, 60, 40);
        getContentPane().add(n6);
        n6.setBounds(130, 100, 60, 40);
        getContentPane().add(n7);
        n7.setBounds(200, 100, 60, 40);
        getContentPane().add(n8);
        n8.setBounds(270, 100, 60, 40);
        getContentPane().add(n9);
        n9.setBounds(340, 100, 60, 40);

        lbl_Inferior.setText("Numero 6     Numero 7      Numero 8     Numero 9     Numero 10");
        getContentPane().add(lbl_Inferior);
        lbl_Inferior.setBounds(130, 150, 380, 14);

        lbl_Superior.setText("Numero 1     Numero 2      Numero 3     Numero 4     Numero 5");
        getContentPane().add(lbl_Superior);
        lbl_Superior.setBounds(130, 80, 380, 14);

        Heap_Sort.setText("Heap Sort");
        Heap_Sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Heap_SortMouseClicked(evt);
            }
        });
        getContentPane().add(Heap_Sort);
        Heap_Sort.setBounds(130, 270, 170, 30);

        Bubble_Sort.setText("Bubble Sort");
        Bubble_Sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bubble_SortMouseClicked(evt);
            }
        });
        getContentPane().add(Bubble_Sort);
        Bubble_Sort.setBounds(130, 240, 170, 30);

        Quick_Sort.setText("Quick Sort");
        Quick_Sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quick_SortMouseClicked(evt);
            }
        });
        getContentPane().add(Quick_Sort);
        Quick_Sort.setBounds(310, 270, 160, 30);

        Merge_Sort.setText("Merge Sort");
        Merge_Sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Merge_SortMouseClicked(evt);
            }
        });
        getContentPane().add(Merge_Sort);
        Merge_Sort.setBounds(310, 240, 160, 30);

        btnAlmacenar.setText("Procesar Numeros");
        btnAlmacenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlmacenarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAlmacenar);
        btnAlmacenar.setBounds(130, 180, 340, 23);

        res1.setEditable(false);
        res1.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res1);
        res1.setBounds(10, 310, 50, 40);

        res2.setEditable(false);
        res2.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res2);
        res2.setBounds(70, 310, 50, 40);

        res3.setEditable(false);
        res3.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res3);
        res3.setBounds(130, 310, 50, 40);

        res4.setEditable(false);
        res4.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res4);
        res4.setBounds(190, 310, 50, 40);

        res5.setEditable(false);
        res5.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res5);
        res5.setBounds(250, 310, 50, 40);

        res6.setEditable(false);
        res6.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res6);
        res6.setBounds(310, 310, 50, 40);

        res7.setEditable(false);
        res7.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res7);
        res7.setBounds(370, 310, 50, 40);

        res8.setEditable(false);
        res8.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res8);
        res8.setBounds(430, 310, 50, 40);

        res9.setEditable(false);
        res9.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res9);
        res9.setBounds(490, 310, 50, 40);

        res10.setEditable(false);
        res10.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(res10);
        res10.setBounds(550, 310, 50, 40);

        clean.setText("Limpiar numeros Ordenados");
        clean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanMouseClicked(evt);
            }
        });
        getContentPane().add(clean);
        clean.setBounds(130, 203, 340, 30);

        jLabel1.setText("ULISES ISAAC ROCHA HUERTA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(374, 350, 220, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("?");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 50, 23, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bubble_SortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bubble_SortMouseClicked
        int nn=10;
        int ArrayN[] = new int[nn];
        ArrayN[0]=N1;   ArrayN[5]=N6;
        ArrayN[1]=N2;   ArrayN[6]=N7;
        ArrayN[2]=N3;   ArrayN[7]=N8;
        ArrayN[3]=N4;   ArrayN[8]=N9;
        ArrayN[4]=N5;   ArrayN[9]=N10;
            ordenaBurbuja(ArrayN);
    //imprime numeros ordenados
res1.setText(""+ArrayN[0]);
res2.setText(""+ ArrayN[1]);
res3.setText(""+ ArrayN[2]);
res4.setText(""+ ArrayN[3]);
res5.setText(""+ ArrayN[4]);
res6.setText(""+ ArrayN[5]);
res7.setText(""+ ArrayN[6]);
res8.setText(""+ ArrayN[7]);
res9.setText(""+ ArrayN[8]);
res10.setText(""+ ArrayN[9]);
    }//GEN-LAST:event_Bubble_SortMouseClicked

    private void btnAlmacenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlmacenarMouseClicked
    d1 = this.n1.getText();     d2 = this.n2.getText();
    d3 = this.n3.getText();     d4 = this.n4.getText();
    d5 = this.n5.getText();     d6 = this.n6.getText();
    d7 = this.n7.getText();     d8 = this.n8.getText();
    d9 = this.n9.getText();     d10 = this.n10.getText();
    convertir();
    }//GEN-LAST:event_btnAlmacenarMouseClicked

    private void Merge_SortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Merge_SortMouseClicked
        int vec[]={N1,N2,N3,N4,N5,N6,N7,N8,N9,N10};
        ordenacionMergeSort(vec);
        imprimirVector(vec);
    }//GEN-LAST:event_Merge_SortMouseClicked

    private void cleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseClicked
        limpiarcaja();
    }//GEN-LAST:event_cleanMouseClicked

    private void Heap_SortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Heap_SortMouseClicked
    int arr[] = {N1,N2,N3,N4,N5,N6,N7,N8,N9,N10};
    int i;
    for(i=arr.length; i>1; i--){
                  fnSortHeap(arr, i - 1);      
                }
    //imprime numeros ordenados
    res1.setText(""+ arr[0]);   res6.setText(""+ arr[5]);
    res2.setText(""+ arr[1]);   res7.setText(""+ arr[6]);
    res3.setText(""+ arr[2]);   res8.setText(""+ arr[7]);
    res4.setText(""+ arr[3]);   res9.setText(""+ arr[8]);
    res5.setText(""+ arr[4]);   res10.setText(""+ arr[9]);
    }//GEN-LAST:event_Heap_SortMouseClicked

    private void Quick_SortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quick_SortMouseClicked
        int[] numeros = new int[10];
        numeros[0]=N1;
        numeros[1]=N2;
        numeros[2]=N3;
        numeros[3]=N4;
        numeros[4]=N5;
        numeros[5]=N6;
        numeros[6]=N7;
        numeros[7]=N8;
        numeros[8]=N9;
        numeros[9]=N10;
        quickSort(numeros, 0, numeros.length - 1);
        res1.setText(""+numeros[0]);    res6.setText(""+numeros[5]);
        res2.setText(""+numeros[1]);    res7.setText(""+numeros[6]);
        res3.setText(""+numeros[2]);    res8.setText(""+numeros[7]);
        res4.setText(""+numeros[3]);    res9.setText(""+numeros[8]);
        res5.setText(""+numeros[4]);    res10.setText(""+numeros[9]);
    }//GEN-LAST:event_Quick_SortMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
JOptionPane.showMessageDialog(this, ""+
"1.-Ingresa los numeros dentro de las cajas blancas de datos\n\n" +
"2.-Presiona el boton''Procesar Numeros'' para que el sistema\n\n" +
"pueda utilizar los numeros ingresados.\n" +
"3.-Seleccione el metodo de ordenamiento de datos,\n" +
"a continuacion observara los datos\n"+
"ya ordenados en la parte inferior\n\n" +
"***************\n" +
"*Si desea usar numeros diferentes,\n" +
"presione el boton ''Limpiar numeros Ordenados '',\n" +
"modifique los numeros y elija un metodo diferente.");
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Bubble_Sort;
    private javax.swing.JToggleButton Heap_Sort;
    private javax.swing.JToggleButton Merge_Sort;
    private javax.swing.JToggleButton Quick_Sort;
    private javax.swing.JButton btnAlmacenar;
    private javax.swing.JButton clean;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Inferior;
    private javax.swing.JLabel lbl_Superior;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n10;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    private javax.swing.JTextField n7;
    private javax.swing.JTextField n8;
    private javax.swing.JTextField n9;
    private javax.swing.JTextField res1;
    private javax.swing.JTextField res10;
    private javax.swing.JTextField res2;
    private javax.swing.JTextField res3;
    private javax.swing.JTextField res4;
    private javax.swing.JTextField res5;
    private javax.swing.JTextField res6;
    private javax.swing.JTextField res7;
    private javax.swing.JTextField res8;
    private javax.swing.JTextField res9;
    // End of variables declaration//GEN-END:variables

public void convertir(){
    N1 = Integer.parseInt(d1);  N6 = Integer.parseInt(d6);
    N2 = Integer.parseInt(d2);  N7 = Integer.parseInt(d7);
    N3 = Integer.parseInt(d3);  N8 = Integer.parseInt(d8);
    N4 = Integer.parseInt(d4);  N9 = Integer.parseInt(d9);
    N5 = Integer.parseInt(d5);  N10 = Integer.parseInt(d10);
}
public void limpiarcaja(){
    res1.setText("");
    res2.setText("");
    res3.setText("");
    res4.setText("");
    res5.setText("");
    res6.setText("");
    res7.setText("");
    res8.setText("");
    res9.setText("");
    res10.setText("");
}

/* Método de ordenación mediante algoritmo de BubbleSort */
    public void ordenaBurbuja(int ArrayN[]) {
        /* Bucle desde 0 hasta la longitud del array -1 */
        for (int i = 0; i < ArrayN.length - 1; i++) {
            /* Bucle anidado desde 0 hasta la longitud del array -1 */
            for (int j = 0; j < ArrayN.length - 1; j++) { /* Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array) */ if (ArrayN[j] > ArrayN[j + 1]) {
                    /* guardamos el número de la posicion j+1 en una variable (el menor) */
                    int temp = ArrayN[j + 1];
                    /* Lo intercambiamos de posición */
                    ArrayN[j + 1] = ArrayN[j];
                    ArrayN[j] = temp;
                    /* y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado*/
                    /* de esta forma vamos dejando los números mayores al final del array en orden*/
                }
            }
        }
    }

    
/* Método de ordenación mediante algoritmo de MergeSort */
    public  void ordenacionMergeSort(int vec[]){
                if(vec.length<=1) return;
                int mitad= vec.length/2;
                int izq[]=Arrays.copyOfRange(vec, 0, mitad);
                int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
                ordenacionMergeSort(izq);
                ordenacionMergeSort(der);       
                combinarVector(vec, izq, der);
        }
    public void combinarVector(int v[], int izq[],int der[]){
                int i=0;
                int j=0;
                for(int k=0;k<v.length;k++){
                        if(i>=izq.length){
                                v[k]=der[j];
                                j++;
                                continue;
                        }
                        if(j>=der.length){
                                v[k]=izq[i];
                                i++;
                                continue;
                        }
                        if(izq[i]<der[j]){
                                v[k]=izq[i];
                                i++;
                        }else{
                                v[k]=der[j];
                                j++;
                        }
                }
        }
    public void imprimirVector(int vec[]){
                res1.setText(""+vec[0]);
                res2.setText(""+vec[1]);
                res3.setText(""+vec[2]);
                res4.setText(""+vec[3]);
                res5.setText(""+vec[4]);
                res6.setText(""+vec[5]);
                res7.setText(""+vec[6]);
                res8.setText(""+vec[7]);
                res9.setText(""+vec[8]);
                res10.setText(""+vec[9]);
        }

    
/* Método de ordenación mediante algoritmo de HeapSort */
    public void fnSortHeap(int arr[], int arr2){
                  int i, o;
                  int lCh, rCh, mCh, root, tmp;
                  root = (arr2-1)/2;
                  for(o = root; o >= 0; o--)
                  {
                        for(i=root;i>=0;i--)
                        {
                              lCh = (2*i)+1;
                              rCh = (2*i)+2;
                              if((lCh <= arr2) && (rCh <= arr2))
                              {
                                    if(arr[rCh] >= arr[lCh])
                                    {
                                          mCh = rCh;
                                    }
                                    else
                                    {
                                          mCh = lCh;
                                    }
                              }
                              else
                              {
                                    if(rCh > arr2)
                                    {
                                          mCh = lCh;
                                    }
                                    else
                                    {
                                          mCh = rCh;
                                    }
                              }

                              if(arr[i] < arr[mCh])
                              {
                                    tmp = arr[i];
                                    arr[i] = arr[mCh];
                                    arr[mCh] = tmp;
                              }
                        }
                  }
                  tmp = arr[0];
                  arr[0] = arr[arr2];
                  arr[arr2] = tmp;
                  return;
            }
    
    
/* Método de ordenación mediante algoritmo de QuickSort */
public void quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }    

}
