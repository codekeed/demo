package Constructor;

import java.util.Scanner;

public class Box {
	
	int length, width,height;
	
	 public void volume() 
	{ Scanner sc = new Scanner(System.in);
	   System.out.println("Enter length:");    
	int length = sc.nextInt();
	System.out.println("Enter width:");
	int width = sc.nextInt();
	System.out.println("Enter width:");
	int height = sc.nextInt();
	        
		
		System.out.println("Volume:"+length*width*height);
	}

}
