package proram;

public class Pattern {

	public static void main(String []ars){
		for(int i=1;i<=4; i++){
			for(int j=1;j<=7; j++){
				if(j>=5-i && j<=i+3){
					System.out.print("*");
				}else{
				System.out.print(" ");
			}
			}
			System.out.println("");
		}
	}
}
