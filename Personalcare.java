/*		-- MINI PROJECT --
		-- COVID MART --
		Farhan Sadid 
		Wilbert Harianto
		Personalcare.java		*/
		
class Personalcare extends Product{
	private String desc;
	
	Personalcare(){};
	Personalcare(String a, String b, double c, int d, String desc){
		super(a,b,c,d); this.desc=desc;
	}
	
	public String display(){
		return ""+ gcode()+"\t"+ gname()+"\t" + gprice()+"\t"+ gquantity()+"\t"+ desc;
		
	}
}