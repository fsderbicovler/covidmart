/*		-- MINI PROJECT --
		-- COVID MART --
		Farhan Sadid 
		Wilbert Harianto
		Product.java		*/ 
		
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
		
class Staff implements Staffdata{
	private String id;
	
	ArrayList<Product> productlist;			//ASSOCIATE TO PRODUCT
	Product product;
	
	
	//Input option
	Scanner input = new Scanner(System.in);
	
	
	Staff(){ 
		productlist= new ArrayList<Product>();
		}
		
	public void staffid(String id){this.id=id;}
	
	public void addproduct(Product p){ 				//adding fnb data
		productlist.add(p);
	}
	
	
	public void printproduct(){
		for(int b=0; b< productlist.size(); b++){
			System.out.println(((Product)productlist.get(b)).display());
		}
	}
	
	public void printgross(){
		for(int c=0; c< productlist.size(); c++){
				System.out.println(((Product)productlist.get(c)).displaygross());
			}
	}
	
	public void login(){
		
		//login staff
		id = JOptionPane.showInputDialog("Please enter the staff id : ");
		
		//JOptionPane.showMessageDialog(null," Login SUCCESSFUL ");
		//Welcome staff
		switch(id){
			case "s01":
				System.out.println("\n\nStaff number: "+c01+", ");
				System.out.println("Welcome "+ s01+" ("+ j01+")");
				break;
			case "s02":
				System.out.println("\n\nStaff number: "+c02+", ");
				System.out.println("Welcome "+ s02+" ("+ j02+")");
				break;
			default: 
				JOptionPane.showMessageDialog(null,"Unidentified Staff ID"," UNKNOWN STAFF ",JOptionPane.WARNING_MESSAGE);
				System.exit(0);
		}
		//Main menu
		System.out.println("-----------------------------");
		System.out.println(" WELCOME TO COVID MART\t");
		System.out.println("-----------------------------");
		System.out.println(" 1. Add new Products");
		System.out.println(" 4. Exit");
		System.out.print("Please choose the menu :");
	}//login
	
	public void nextmenu(){
		
		//Full menu (After adding products)
		
		System.out.println("\n Continue ?? ...");
		System.out.println("-----------------------------");
		System.out.println(" 1. Add new Products");
		System.out.println(" 2. Display Products");
		System.out.println(" 3. Display Gross income");
		System.out.println(" 4. Exit");
		System.out.print("Please choose the menu :"); 
	}
	public void inputmenu(){
		String code; String name; double prc; int qty; String etc;
		//HOW TO INPUT PRODUUCT
		System.out.print("- product code\t\t:");
			code = input.nextLine();
		System.out.print("- product name (2 words):");
			name = input.nextLine();
		System.out.print("- product price (RM)\t:");
			prc = Integer.parseInt(input.nextLine());
		System.out.print("- product quantity\t:");
			qty = Integer.parseInt(input.nextLine());
		System.out.print("- product expdate/desc\t:");
			etc = input.nextLine();
		product = new Fnb(code, name, prc, qty, etc);
			addproduct(product); 
					
		nextmenu();
		mainmenu();
	}
	
	public void mainmenu(){
					
		//Main menu option
		int a;
		a= Integer.parseInt(input.nextLine());
		
		//Main menu option 
		if(a== 1){
			prodmenu();
			a=Integer.parseInt(input.nextLine());
			
			System.out.println("\n-- INPUT PRODUCT --");
			System.out.println("-----------------------");
			
			switch(a){
				case 1: 
					inputmenu();
					break;
					
				case 2:
					inputmenu();
					
					nextmenu();
					mainmenu();
					break;
				case 4:
					System.exit(0);
			}
						
		}
		
		else if(a== 2){					//DISPLAY MENU
			dismenu();
		}
		else if(a== 3){
			System.out.println("\n COVIDMART Gross Income");
			System.out.println("----------------------------------------");
			System.out.println("Code\tName\t\tPrice\tQty\tGross income");
			System.out.println("------------------------------------------------");
			printgross();
			nextmenu();
			mainmenu();
		}
		
		else if(a== 4){return;}
		else{System.out.println("-- Invalid input --");}
		
		
		
		
	}//mainmenu
	
	public void prodmenu(){
		System.out.println("\n\n-- ADD PRODUCT --");
		System.out.println("---------------------");
		System.out.println(" 1. Food and Beverage");
		System.out.println(" 2. Personal care");
		System.out.println(" 4. Exit");
		System.out.print("choose product :");
	}//prodmenu
	
	public void dismenu(){
			System.out.println("\n\nDisplaying ...");
			System.out.println("---------------------------------------");
			System.out.println(" COVIDMART Products");
			System.out.println("----------------------------------------");
			System.out.println("Code\tName\t\tPrice\tQty\tExpdate/Desc");
			System.out.println("------------------------------------------------");
					printproduct();
					nextmenu();
					mainmenu();
	}//dismenu
	
}//Staff