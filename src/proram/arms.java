package proram;

import java.util.Scanner;

public class arms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a; int arms=0; int d;
		  
		Scanner sc=new Scanner(System.in);
		 int no=sc.nextInt();
		 d=no;
		 while(no>0){
		 a=no%10;
		 no=no/10;
		 
		  arms=a*a*a +arms;
			
		}
		 
		 if(arms ==d){
         System.out.print("No is   armstrong");
	}
	
	else{
		System.out.print("No is not armstrong");
	}

}
}
 
