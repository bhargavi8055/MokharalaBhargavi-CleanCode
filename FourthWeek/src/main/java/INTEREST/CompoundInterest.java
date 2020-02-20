package INTEREST;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CompoundInterest {
	
	double calculate() {
		Scanner scan=new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.println("enter principle amount");
		float p=scan.nextFloat();
		
		output.println("enter rate of interest");
		int r=scan.nextInt();
		
		output.println("time (in years)");
		double t=scan.nextFloat();
		
		double amount=p*Math.pow(1+r/100, t);
		return amount;
		
	}
}
