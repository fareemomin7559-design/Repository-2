package datatype;

public class DataTypeEx {

	public static void main(String[] args) {
		int age=19;
		double height=5.6;
		String username="Faree";
		char grade='A';
		double percentage=95.68;
		String gender="Female";
		/*
		System.out.println("Age : " +age);
		System.out.println("Height : " +height);
		System.out.println("Username : " +username);
		System.out.println("Grade : " +grade);
		System.out.println("Percentage : " +percentage);
		System.out.println("Gender : " +gender);
		*/
		//In BITS
		System.out.println(" -Bits Value of all Data Type :");
		System.out.println("The storage area of byte :"+Byte.SIZE);
		System.out.println("The storage of short :"+Short.SIZE);
		System.out.println("The storage of int :"+Integer.SIZE);
		System.out.println("The storage of the long :"+Long.SIZE);
		System.out.println("\n");
		
		//In Bytes
		System.out.println(" -Byts,Max and Min Value of Byte Data Type :");
		System.out.println("The storage area of byte :" +Byte.SIZE/8);
		System.out.println("The smallest value of byte :"+Byte.MIN_VALUE);
		System.out.println("The largest vlaue of byte :"+Byte.MAX_VALUE);
		System.out.println("\n");
		
		//In Short
		System.out.println(" -Byts,Max and Min Value of Short Data Type :");
		System.out.println("The storage area of short :" +Short.SIZE/8);
		System.out.println("The smallest size of short :"+Short.MIN_VALUE);
		System.out.println("The largest size of short :"+Short.MAX_VALUE);
		System.out.println("\n");
		
		//In Integer
		System.out.println(" -Byts,Max and Min Value of Integer Data Type :");
		System.out.println("The storage area of int :" +Integer.SIZE/8);
		System.out.println("The smallest size of int:"+Integer.MIN_VALUE);
		System.out.println("The largest size of int :"+Integer.MAX_VALUE);
		System.out.println("\n");
		
		//In Long
		System.out.println(" -Byts,Max and Min Value of Long Data Type :");
		System.out.println("The storage area of long :"+Long.SIZE/8);
		System.out.println("The smallest size of long:"+Long.MIN_VALUE);
		System.out.println("The largest size of iong :"+Long.MAX_VALUE);

	}
	

}
