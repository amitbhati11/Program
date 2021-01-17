package proram;

public class fuldmnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int k=0;
		for(int i=1; i<=5; i++){
			
			if(i<=3)k++;
			else k--;
			for(int j=1; j<=5; j++){
				if(j>=4-k && j<=k+2){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println ("");
		}

	}

}
