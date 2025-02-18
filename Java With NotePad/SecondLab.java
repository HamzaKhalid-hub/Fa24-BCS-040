import java.util.Scanner;

class SecondLab{

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Print Statement cursor remains on same line");
		System.out.println("Println Statement cursor comes on a new line.");
 
		byte b=1; //1byte (upto 128)
		short s=1000; //2bytes
		int i=100000; //4bytes
		long l=20000000; //8bytes


		System.out.printf("Value of byte is: %-10d \n",b);
		
		float f=10.0f; //upto 8 decmasl
		double d; //upto 16 decimals
		
		System.out.printf("Value of Float is: %f \n", f);

		char c='A';
		System.out.printf("Value of char  is: %s \n", c);
		
		Boolean bool=true;
		System.out.printf("Value of Boolean  is: %s \n", b);


		byte b1;
		short s1;
		int i1;
		long l1;

		//System.out
		System.out.print("Enter Value of Byte: ");
		b1=input.nextByte();
		System.out.printf("Value of byte is: %d \n", b1);

		System.out.print("Enter Value of Short: ");	
		s1=input.nextShort();
		System.out.printf("Value of byte is: %d\n", b1);

		System.out.print("Enter Value of int: ");	
		i1=input.nextInt();
		System.out.printf("Value of byte is: %d", i1);
	
		System.out.print("Enter Value of long: ");	
		l1=input.nextLong();
		System.out.printf("Value of byte is: %d\n", l1);

		float f1;
		double d1;

		System.out.print("Enter Value of float: ");	
		f1=input.nextFloat();
		System.out.printf("Value of byte is: %,.3f\n", f1);

		System.out.print("Enter Value of Double: ");	
		d1=input.nextDouble();
		System.out.printf("Value of byte is: %,.3f\n", d1);

		String str;
		System.out.print("Enter Value of string: ");	
		str=input.next();
		System.out.printf("Value of String with -next- is: %s\n", str);

		String str1;
		System.out.print("Enter Value of string: ");	
		str1=input.nextLine();
		System.out.printf("Value of String with -nextLine- is: %s\n", str1);

		char c2;
		System.out.print("Enter Value of Char: ");	
		c2=input.next().charAt(0);
		System.out.printf("Value of byte is: %c\n", c2);

		String str3;
		System.out.print("Enter Value of string:");	
		str3=input.next();
		System.out.printf("Value of byte is: %s\n", str3);

}
}


