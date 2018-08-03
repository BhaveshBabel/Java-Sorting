import java.util.Scanner;
public class selection_sort {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int i, j, temp;
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(i = 0; i<size-1; i++) {
			
			int min = i;
			//System.out.println("Minimum  Index1 :  "+min);
			for(j = i+1; j < size; j++) {
				
				if(arr[min] > arr[j]) {		
					min = j;
				//	System.out.println("Minimum Index2 : "+min);
				}
			}	
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;		
		}
		System.out.println("Sorted Array : ");
		for(i = 0; i < size; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
