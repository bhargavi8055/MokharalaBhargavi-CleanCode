package INTEREST;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Simpleinterest {
	float calculate() {
		Scanner scan=new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.println("enter principle amount");
		float p=scan.nextFloat();
		
		output.println("enter rate of interest");
		int r=scan.nextInt();
		
		output.println("time (in years)");
		float t=scan.nextFloat();
		
		float amount=p*t*r/100;
		return amount;
		
	}
}
