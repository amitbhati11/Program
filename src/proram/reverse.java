package proram;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sd=new Scanner(System.in);
		
		int no=sd.nextInt();
		
		 
		
		int a; int rev=0;
		
		while(no>0){
			
			a=no%10;
			no=no/10;
			rev=rev*10+a;
			
			
			
			
		}
		System.out.println("value of rev:" +rev); 

	}

}