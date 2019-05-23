package ordenamientos;

/**
 * @author Ulises
 */
public class HeapSort {
     public static void main(String[] args){
            int i;
            int a=23,b=31,c=13,d=17,e=41,f=16,g=27,h=5;
            int arr[] = {a,b,c,d,e,f,g,h};
            
                  
            System.out.println("Heap Sort");   
            System.out.println("\n---------------\n");
            System.out.println("Unsorted array");
            
            
            for (i = 0; i < arr.length; i++)
                  System.out.print(" "+arr[i]);
            for(i=arr.length; i>1; i--){
                  fnSortHeap(arr, i - 1);      
                }
            System.out.println("\n\n---------------\n");
            System.out.println("Sorted array");
            
            for (i = 0; i < arr.length; i++){
                  System.out.print(" "+arr[i]);
                }
            System.out.println("\n\n---------------\n");
      }
     
                public static void fnSortHeap(int arr[], int arr2){
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
     
}