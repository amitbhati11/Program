package proram;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no;
		Scanner sc=new Scanner(System.in);
		
		no=sc.nextInt();
		
		if(no%2==0){
			
			System.out.println("its an even");
			
		}else{
			
			System.out.println("its an odd");
		}
		
		
	}

}
