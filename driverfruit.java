//# driverfruit
//OOPs Inheritance concept sample
class fruit{
	//states
	String origin;
	double price;
	String name;
	
	//Constructor
	fruit(){
		//L.I
	}
	fruit(String origin,double price,String name){
		//L.I 
		this.origin=origin;
		this.price=price;
		this.name=name;
	}
}

class mango extends fruit
{
	//states
	String taste;
	String color;
	
	//constructor
	mango(){
		//L.I 
	}
	mango(String taste,String color,String origin,double price,String name){
		super(origin,price,name);
		//L.I 
		this.taste=taste;
		this.color=color;
	}
	
	//behaviour
	public void detailsOfMango(){
		System.out.println("The name of the fruit is "+name);
		System.out.println("The price of the fruit is "+price);
		System.out.println("The origin of the fruit is "+origin);
		System.out.println("The taste of the fruit is "+taste);
		System.out.println("The color of the fruit is "+color);
		System.out.println("*********************************");
	}
}

class apple extends fruit
{
	//states
	String taste;
	String color;
	
	//constructor
	apple(){
		//L.I 
	}
	apple(String taste,String color,String origin,double price,String name){
		super(origin,price,name);
		//L.I 
		this.taste=taste;
		this.color=color;
	}
	
	//behaviour
	public void detailsOfApple(){
		System.out.println("The name of the fruit is "+name);
		System.out.println("The price of the fruit is "+price);
		System.out.println("The origin of the fruit is "+origin);
		System.out.println("The taste of the fruit is "+taste);
		System.out.println("The color of the fruit is "+color);
		System.out.println("*********************************");
	}
}

class driverfruit{
	public static void main(String [] args){
		apple ref1=new apple("sweet","red","India",130,"Apple");
		ref1.detailsOfApple();
		
		mango ref2=new mango("sweet","yellow","japan",200,"Mango");
		ref2.detailsOfMango();
	}
}
