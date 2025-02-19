class Test{
	public static void main(String[] args){
		int h=30;
		int w=90;
		Rectangle obj=new Rectangle();
		obj.printText();
		int r1=obj.returnText();
		System.out.println("The Number Returned is: " + r1);
		int r2=obj.area(h, w);
		System.out.println("The Area Returned is: " + r2);

		
		Circle c1=new Circle();
		int rad=c1.radius();
		System.out.println("Radius Of Circle is: " +rad);
		int circum=c1.circumference(rad);
		System.out.println("The Circumference of Given Radius is: " +circum);	
	}

}