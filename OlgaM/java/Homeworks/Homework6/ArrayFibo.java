class ArrayFibo {
  
  public static void main ( String[] args ){
     int[] fibo  = {0,0,0, 0,0,0, 0,0,0, 0,0};
     fibo[0]=1;
     fibo[1]=1;
     for ( int i=2; i< fibo.length; i++){
     	fibo[i]=fibo[i-1]+fibo[i-2];
     	}
     for ( int i=0; i <=10; i++) {
     	System.out.print(fibo[i] +" ");
   	  }
   	  
  	 System.out.println("");
   	printArray(fibo);
     }
     
 	public static void printArray( int[] myarr){
 	    for (int i : myarr){
   	  System.out.print( i +" ");	
 		}
	}
}