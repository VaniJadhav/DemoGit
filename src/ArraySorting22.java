import java.util.Arrays;
import java.util.Collections;

public class ArraySorting22 {

	public static void main(String[] args) {
		int []a= {100,20,40,60,40,70,50,30};
	
		//method 1 without built in function
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			
			
				
			for(int j=0;j<n-1;j++) {
			if(a[j]>a[j+1]) {
				
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
			
			}
				
	}
		
		//method 2
		/*Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));*/
		
		//Method3
		/*Arrays.sort(a);
		System.out.println(Arrays.toString(a));*/
		
		//Method 4
		
		Integer b[]={100,20,40,60,40,70,50,30};
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
		
}
}
