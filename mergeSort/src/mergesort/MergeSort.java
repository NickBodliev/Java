package mergesort;
import java.util.Scanner;
public class MergeSort {
    
    static int[] sort(int v[], int stIndex, int finIndex){
        if(stIndex < finIndex)
        {
            int m = (stIndex + finIndex) / 2;
            sort(v, stIndex, m);
            sort(v, m+1, finIndex);
            merge(v, stIndex, m, finIndex);
        }
        return v;
    }
    
    static void merge(int v[], int stIndex, int m, int finIndex){
        if(finIndex - stIndex < 1) //se il vettore v contiene un valore solo 
            return;
        else{                   //se il vettore v contiene più di un valore
            int v1 [] = new int[m-stIndex+1];
            int v2 [] = new int[finIndex-m];
            int i, j;
            for(i = 0; i < v1.length; i++)
                v1[i] = v[stIndex+i];
            for(j = 0; j<v2.length; j++)
                v2[j] = v[m+1+j];
            
            i = 0;
            j = 0;
            int k = stIndex;
            while(i < v1.length && j < v2.length){
                if(v1[i] < v2[j]){
                    v[k] = v1[i];
                    k = k + 1;
                    i = i + 1;
                }
                else{
                    v[k] = v2[j];
                    k = k + 1;
                    j = j + 1;
                }
            }
            int z;
            for(z = i; z < v1.length; z++){
                v[k] = v1[z];
                k = k + 1;
            }
            for(z = j; z < v2.length; z++){
                v[k] = v2[z];
                k = k + 1;
            }
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to the Bodliev's merge sort simulator. This program was  implemented in Java.");
            System.out.println("Insert how many values you want to sort:");
            int[] arr = new int[sc.nextInt()];
            System.out.println("Insert the values you want to sort:");
            for(int i=0;i<arr.length;i++)
                arr[i] = sc.nextInt();
            sort(arr, 0, arr.length-1);
            System.out.println("Here we go, the sorted array is:");
            for(int i = 0; i<arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
     }
}
