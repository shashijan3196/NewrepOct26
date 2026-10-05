package OnlyJavacode;

public class EVENandODDnumbers {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,10};
		
   for (int i=0; i<a.length ; i++)
   {
	   if(a[i]%2==0)    // if we put reminder 1 here it will generate odd numbers
	   {
		   System.out.println(a[i]);
	   }
   }
	}

}
