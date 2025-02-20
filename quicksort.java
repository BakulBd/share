package Mid;

import java.util.*;

public class QuickSort {
    static void quickSort(int a[],int beg,int end) {
        int loc;
        if (beg<end) {
            loc=partition(a,beg,end);
            System.out.println("Beginning: "+ beg+" Ending: "+end);
            System.out.println("Array: "+Arrays.toString(a));
            quickSort(a,beg,loc-1);
            quickSort(a,loc+1,end);
        }
    }

    static int partition(int data[],int beg,int end) {
        int pivot=beg;
        int b=beg+1;
        int s=end;

        while (true) {
            while (b <= end && data[b] <= data[pivot])
                ++b;

            while (s > beg && data[s] > data[pivot])
                --s;

            if (b<s)
                swap(data,b,s);
            else
                break;
        }
        swap(data,pivot,s);
        return s;
    }

    static void swap(int arr[],int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int arr[]={10,7,8,9,1,5};
        int n=arr.length;
        quickSort(arr,0,n-1);
//        System.out.println("Sorted array: "+Arrays.toString(arr));
        System.out.println("Sorted array: ");
        for(int i: arr) {
        	System.out.print(i+" ");
        }
    }
}

