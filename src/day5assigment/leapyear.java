package day5assigment;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		System.out.println("enter your year::");
			 	
			 	int year;
			 	Scanner sc = new Scanner(System.in);
				year = sc.nextInt();
			 	if(year>999 && year<9999)
			 	{
			    boolean leap = false;
			    if (year % 4 == 0) {
		        if (year % 100 == 0) {
			    if (year % 400 == 0)
			          leap = true;
			        else
			          leap = false;
			      }
			      
			     
			      else
			        leap = true;
			    }
			    
			    else
			      leap = false;

			    if (leap)
			      System.out.println(year + " is a leap year.");
			    else
			      System.out.println(year + " is not a leap year.");
			  }
			 	else {
					
					System.out.println("Invalid.....");
				}
			}

		}

