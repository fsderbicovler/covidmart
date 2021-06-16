/*		-- MINI PROJECT --
		-- COVID MART --
		Farhan Sadid 
		Wilbert Harianto
		Fnb.java		*/

import java.util.*;
import java.io.*;

// Fnb = Food and Beverage, personal care, daily
class Fnb extends Product{				//Inheritance
	private String expdate;
	
	//INPUT
	Scanner input = new Scanner(System.in);
	
	Fnb(){}
	Fnb(String code, String name, double price, int quantity, String expdate){
		super(code, name, price, quantity);
		this.expdate= expdate;
	}
	
	public String display(){
		return ""+ gcode()+"\t"+ gname()+"\t" + gprice()+"\t"+ gquantity()+"\t"+ expdate;
	}
	
}