package proram;

public class trinlepattrn {
	
	public static void main (String [] ars){
		
	for(int i=1; i<=7; i++){
		for(int j=1; j<=4; j++){
			if(j>=5-i){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
		}
		}
		System.out.println("");
		
	}

}

}