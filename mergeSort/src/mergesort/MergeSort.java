package mergesort;
import java.util.Scanner;
public class MergeSort {
    static int[] sort(int v[], int stIndex, int finIndex){
        if(stIndex < finIndex)
        {
            int m = (stIndex + finIndex) / 2;
            sort(v, stIndex, finIndex/2);
            sort(v, m+1, finIndex);
            merge(v, stIndex, finIndex);
        }
        return v;
    }
    
    static void merge(int v[], int stIndex, int finIndex){
        int buf;
        for(int i=stIndex; i<=finIndex; i++)
        {
            for(int j=i+1; j<=finIndex; j++)
            {
                if(v[j] < v[i])
                {
                    buf = v[i];
                    v[i] = v[j];
                    v[j] = buf;
                }
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
            for(int i = 0; i<arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
     }
    
}
