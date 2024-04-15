class ArrayClassFive {
    public static void main( String [] args )
    {
        int[] num = { 45,87,23,2,-15,67,1005,-1235,-1076652};
     	for ( int a=0; a< num.length; a++){
		 	System.out.print(num[a] + ";");
		 }
		 System.out.println();
		 for ( int i=0; i< num.length; i++){
     		num[i]=num[i]+5;
 	    }
   	  for ( int b=0; b <num.length; b++) {
     	
   	
       System.out.print(num[b] + ";");
    	  }
     }
}
