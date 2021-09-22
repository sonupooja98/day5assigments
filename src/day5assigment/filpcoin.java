package day5assigment;

import java.util.Scanner;

public class filpcoin {
	public static void main(String[] args) {
		int flip;
		System.out.println("Enter number of times to flip::");
		Scanner sc = new Scanner(System.in);
	 	flip = sc.nextInt();
	 	
        System.out.println("number of times are " +flip);
        int i=1;
        int head = 0;
        int tail = 0;
        while(i<=flip) {
        if(Math.random()<0.5) 
              {
				System.out.println("tail");
				tail=(tail+1);
              }
        	else 
        	  {
					System.out.println("head");
					head=(head+1);
	          }
        	   i++;
}	
	}
}
       

