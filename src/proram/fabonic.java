package proram;

import java.util.Scanner;

public class fabonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st=new Scanner(System.in);
		 int a=st.nextInt();
		int b=st.nextInt();
		int fb;
		 for(int i=1;i<=10; i++){ 
		 
		 
		 fb=a+b;
		 a=b;
		 b=fb;
		 
		 System.out.println( fb) ;
	}

}

}