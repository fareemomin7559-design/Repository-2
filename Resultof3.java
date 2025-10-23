package datatype;
import java.io.*;
public class Resultof3 {

	public static void main(String[] args) throws IOException{
		//Marks of 3 Subjects
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		
		double Eng,Maths,IT,Percentage;
		System.out.println("Enter Marks of English : ");
		Eng=Double.parseDouble(B.readLine());
		
		System.out.println("Enter Marks of Maths : ");
		Maths=Double.parseDouble(B.readLine());
		
		System.out.println("Enter Marks of IT : ");
		IT=Double.parseDouble(B.readLine());
		
		Percentage=Eng+Maths+IT/3.0*100;
		String s=(Percentage>=90)?"A Grade":(Percentage>=70)?"B Grade":(Percentage>=60)?"C Grade":"D Grade";
		Percentage=Double.parseDouble(B.readLine());
			
	}

}
