package HouseConstruction;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction {
	public Construction() {
		Scanner scan=new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		while(true) {
			
			try {
		
				output.println("Enter choice of Material Type:");
		
				output.println("1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
		
				String choice2=scan.next();
		
				int choice=Integer.parseInt(choice2);
				
				if(choice>3 || choice<1) {
				
					output.println("...please look at choices numbers....");
					
					continue;
				}
				String choice1="";
				
				int[] cost= {1200,1500,1800,2500};
				
				double Cost;
		
				if (choice==3) {
					output.println("Do you want fully automated home?(yes/no):\n");
					choice1=scan.next();
				}
		
				output.println("Area of House (in square feet):");
				
				float area=scan.nextFloat();
				
				if(choice==3) {
					
					if(choice1.equals("yes")) {
				
						Cost=cost[3]*area;
					}
					else 
					{
						Cost=cost[2]*area;
					}
				}
				else 
				{
					Cost=cost[choice-1]*area;
				}
		
				output.println("Cost is needed to construct by using your wished materials:"+Cost);
		
				break;	
	
		
			}
			catch(Exception e) {
				output.println("...Please enter a valid choice...");
			}
			}
	}
	
}
