/*		-- MINI PROJECT --
		-- COVID MART --
		Farhan Sadid 
		Wilbert Harianto
		Product.java		*/
		
abstract class Product{					//Abstract class
	private String code;
	private String name;
	private double price;
	private int quantity;
	
	Product(){}
	Product(String code, String name, double price, int quantity){
	this.code= code; this.name= name; this.price= price; this.quantity= quantity;}
	
	public String gcode(){return code;}
	public String gname(){return name;}
	public double gprice(){return price;}
	public int gquantity(){return quantity;}
	
	//setter
	public void scode(String code){this.code= code;}
	public void sname(String name){this.name= name;}
	public void sprice(double price){this.price= price;}
	public void squantity(int quantity){this.quantity= quantity;}
	
	//Abstract function
	public abstract String display();
	public double grossinc(){return price*quantity;}
	public String displaygross(){return ""+ code+"\t"+ name+"\t" + price+"\t"+ quantity+"\t"+ grossinc();}
}