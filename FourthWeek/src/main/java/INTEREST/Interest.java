package INTEREST;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Interest {
	
	public  Interest(){
		Scanner scan=new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		while(true) {
			try {
				output.println("Enter choice\n1.SimpleInterest\\n2.CompoundInterest");
				
				
				String choice2=scan.next();
				
				int choice=Integer.parseInt(choice2);
				
				if(choice!=1&&choice!=2) {
					output.println("...please enter valid input...");
					continue;
				}
				
				if (choice==1) {
					Simpleinterest Si=new Simpleinterest();
					
					float si=Si.calculate();
					
					output.println("Simple Interest :"+si);
					break;
				}
				else if(choice==2) {
					CompoundInterest Ci=new CompoundInterest();
					
					double ci=Ci.calculate();
					
					output.println("Compound Interest :"+ci);
					break;
				}
		
			}
		
			catch(Exception e) {
				output.println("...Please enter a valid input...");
			}
		
		}
	}
}
