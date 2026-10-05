package OnlyJavacode;

public class NthMissingNo {

	public static void main(String[] args) {
//		int sum =0;
     	int[] a = {1,2,3,4,5,6,7,8,10};
//		
//   for (int i=0; i<a.length ; i++)
//   {  
//	   sum =sum+a[i];
//   }
//     int n = 10;
//     int total = n*(n+1)/2;
//     System.out.println("Missing number ="+(total - sum));
//	
	
	
	
	// ----------------Using xor operator
	  int result =0;
	 for(int i=0; i<=10; i++)
	 {
		 result = result ^ i ;
	 }
      for (int i=0 ; i<a.length; i++)
      {
    	  result= result ^ a[i];
      }
      System.out.println("Missing number is == " + result );
	}
}

