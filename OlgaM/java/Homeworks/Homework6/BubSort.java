class BubSort 
{
    public static void main( String [] args )
    {
        int[] bubsor = { 45, 87, 23, 2, -15, 67,1005, -1235, -1076652, 0};
        printArray(bubsor);
        System.out.println("");
        System.out.println("Initial array of langth " + bubsor.length);
        boolean sorted = false;
        int runs = -1;
        
        while(!sorted){
        	sorted = true;
        	runs = runs+1;
        
	        for ( int i=0; i< bubsor.length-1; i++){
	        	if( bubsor[i] > bubsor[i+1]){
	        		sorted = false;
	        		int tmp= bubsor[i];
	        		bubsor[i] = bubsor [i+1];
	        		bubsor [i+1]= tmp;
	        	
	        	printArray(bubsor);
	        	System.out.println("");
	        	}
			 }
        }
        //printArray(bubsor);
        //System.out.println("");
        System.out.println("Array sorted in "+ runs +" runs");
	} 

 	public static void printArray( int[] myarr){
 	    for (int i : myarr){
   	  System.out.print( i +" ");
   	  }
 	}
}