package proram;

public class lstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++){
			 
			for(int j=1;j<=4;j++){
				
				if(j>=5-i){
					System.out.print("*");
				}
				else{
					System.out.print (" ");
				}
			} System.out.println ("");
		}
		
	}

}
