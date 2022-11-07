class car{
	String color;
	String gearType;
	int door;
	car(){}
	car(String c, String g, int d){
		color=c; 
		gearType=g;
		door=d; 
	}
}
public class Ex2 {

	public static void main(String[] args) {
		car c1=new car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		
		car c2=new car("white", "auto", 4);
		System.out.println("c1의 color="+c1.color+ ", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c1의 color="+c2.color+ ", gearType="+c2.gearType+", door="+c2.door);
	}

}
