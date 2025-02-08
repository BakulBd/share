package Mid;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MS2 {
	private static void merge(int[] input,int[] left,int[] right) {
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				input[k]=left[i++];
			}else {
				input[k]=right[j++];
			}
			k++;
		}
		
		while(i<left.length) {
			input[k++]=left[i++];
		}
		while(j<right.length) {
			input[k++]=right[j++];
		}
		// Printing the merged result at each step
        System.out.print("Merge step: ");
        for (int num:input) {
            System.out.print(num +" ");
        }
        System.out.println();
	}
	private static void mergesort(int[] input) {
		if(input.length<2)
			return;
		int mid=input.length/2;
		int[] leftHalf=new int[mid];
		int[] rightHalf=new int[input.length-mid];
		for(int i=0;i<leftHalf.length;i++) {
			leftHalf[i]=input[i];
		}
		for(int i=mid;i<input.length;i++) {
			rightHalf[i-mid]=input[i];
		}
		 // Printing the array before the merge sort step
        System.out.print("Splitting: ");
        for (int num:input) {
            System.out.print(num+" ");
        }
        System.out.println();
		
		mergesort(leftHalf);
		mergesort(rightHalf);
		merge(input,leftHalf,rightHalf);
		
	}
	
	
	public static void main(String[] args) {
//		Random r=new Random();
//		int[] numbers=new  int[10];
//		for(int i=0;i<numbers.length;i++) {
//			numbers[i]=r.nextInt();
//		}
//		int[] a= new int[10];
//		int  p=0;
//		
//		File f = new File("C:\\input.txt");
//		try {
//			Scanner sc=new Scanner(f);
//			while(sc.hasNextInt()) {
//				a[p++]=sc.nextInt();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		int number1[]= {20, 7, 15, 9, 35, 4, 1, 11, 7, 16};
		mergesort(number1);
		System.out.println("\nOutput:");
		for(int i=0;i<number1.length;i++) {
			System.out.print(number1[i]+",");
		}
		
		
	}

}
