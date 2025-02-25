import java.util.Scanner;
class Display{
	public static void main(String[] args){
	
	Student s1=new Student("Hamza", 3.14f, "asdff", 0321);

	String name=s1.getName();
	System.out.println("Students name is: "+name);
	
	float cgpa=s1.getGpa();
	System.out.println("Students cgpa is: "+cgpa);

	String address=s1.getCity();
	System.out.println("Students Address is: "+address);

	long phone=s1.getPhone();
	System.out.println("Students Phone No. is: "+phone);
	
	String regNo=s1.getRegNo();
	System.out.println("Students Registration No. is: "+regNo);
	

	Student s2=new Student("Ali", 3.14f, "awqewda", 0321);
	String name1=s2.getName();
	System.out.println("Students name is: "+name1);
	
	float cgpa1=s2.getGpa();
	System.out.println("Students cgpa is: "+cgpa1);

	String address1=s2.getCity();
	System.out.println("Students Address is: "+address1);

	long phone1=s2.getPhone();
	System.out.println("Students Phone No. is: "+phone1);
	
	String regNo1=s2.getRegNo();
	System.out.println("Students Registration No. is: "+regNo1);

	Scanner input=new Scanner(System.in);

	
	String inputName;
	String inputPassword;

	System.out.print("Enter Username:");
	inputName=input.nextLine();



	System.out.print("Enter Password:");
	inputPassword=input.nextLine();

	if (inputName.equals(Details.userName)){
	System.out.print("\nUsername is a match");
	}
	else{
	System.out.print("\nIncorrect Username");
	}
	 if (inputPassword.equals(Details.password)) {
	System.out.print("\nPassword is a match");
	}
	else{
	System.out.print("\nIncorrect password");
	}
}

}

