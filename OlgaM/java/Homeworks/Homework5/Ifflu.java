class Ifflu
{
	public static void main( String[] args )
	{
		for ( int  i=1; i<=100; i++)
		{
		 	//System.out.println( i );
		 	int x;
		 	int y;
		 	int z;
		 	
		 	if ( i % 3 == 0 ) { 
			 x=3; }
			 else { x=0;
			 }
			 
		 	if ( i % 5 == 0 ) { 
			 y=5; }
			 else { y=0;
			 }	 
			 z = x + y;
			//System.out.println( z );
			
			 switch(z) {
			 	case 0:
			 		System.out.println(i);
			 		break;
			 	case 3:
			 		System.out.println("Buzz");
			 		break;
			 	case 5:
			 		System.out.println("Fuzz");
			 		break;
			 	case 8:
			 		System.out.println("BuzzFuzz");
			 		break;		
			 	default:
			 		System.out.println("Error");
			 }
		}
	}
}