class Ex4{
	static {
		System.out.println("static {}");
		
	}
	{
		System.out.println("{}");
	}

public Ex4() { System.out.println("생성자");}
	
	public static void main(String[] args) {
		System.out.println("Ex4 bt=new Ex4();");
		Ex4 bt=new Ex4();
		
		System.out.println("Ex4 bt2=new Ex4();");
		Ex4 bt2=new Ex4();
	}
}
