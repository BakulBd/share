package Mid;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
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
		
		
		int number1[]= {2,6,8,9,1,5,9,11};
		int number2[]= {8 ,6, 2, 9, 1, 5, 11, 9};	
		
		
		mergesort(number1);
		mergesort(number2);
		System.out.println("\nFirst:");
		for(int i=0;i<number1.length;i++) {
			System.out.print(number1[i]+",");
		}
		System.out.println("\nSecond:");
		for(int i=0;i<number2.length;i++) {
			System.out.print(number2[i]+",");
		}
		int x=number1.length+number2.length;
		int[] Final=new int[x];
		merge(Final, number1, number2);
		System.out.println("\nFinal:");
		for(int i=0;i<Final.length;i++) {
			System.out.print(Final[i]+",");
		}
		
		
	}

}
