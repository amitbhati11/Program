package proram;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		 int a=st.nextInt();
		int b=st.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a:" +a);
		System.out.println("value of b:" +b);
		
		 
	}

}
