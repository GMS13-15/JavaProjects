/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


class CarShowRoom
{
	static void carDetails(String modelName,int mdlyear, String color, String varient, int askPrice, String addInfo){
		System.out.println("Model Name : " + modelName);
		System.out.println("Model Year : " + mdlyear);
		System.out.println("Colour : " + color);
		System.out.println("Varient : " + varient);
		System.out.println("Asking Price : " + askPrice);
		System.out.println("Details : " + addInfo);

	}
	
	static void dis(){
		System.out.println("\t\t\t\t1.Place Order" + "\t\t2.Add To Wishlist");
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);		
				//carDetails("A6",2016,"black",120000,"good");
		    				    
		//System.out.println(carDetails ());
		System.out.println("\t\t\t\tWelcome to GM Cars");
		System.out.println("");
		System.out.println("Leta begin riding...");
		System.out.println("");
		System.out.println("Which Type Of Car You Are Looking For!..");
		System.out.println("");
		//String[] clist = new String [4];
		//clist[0] = "1.Sedan";
		String clist[] = {"1.Sedan", "2.SUV","3.Budget", "4.HatchBack", "5.Luxury" };
		System.out.println(clist[0]);
		System.out.println(clist[1]);
    System.out.println(clist[2]);
    System.out.println(clist[3]);
    System.out.println(clist[4]);
    
    System.out.println("\n\tYour Choice?..");
    int userChc = sc.nextInt();
    System.out.println("");
    
    
    switch(userChc){
    	case 1:
    		System.out.println("Choose Brand");
    		String brand[] = {"1.Honda", "2.Suzuki", "3.Tata", "4.Check Out Other Cars"};
    		System.out.println(brand[0]);
    		System.out.println(brand[1]);
				System.out.println(brand[2]);
				System.out.println(brand[3]);
				//System.out.println(brand[4]);
			 // System.out.println(brand[5]);
			  
			  int userBrd = sc.nextInt();
			  
			  switch (userBrd){
			  	case 1:
			  		System.out.println("");
			  		System.out.println("Choose Model");
			  		System.out.println("");
			  		System.out.println("1.City" + "\n2.Civic" + "\n3.Amaze" + "\n4.City 4th Gen");
			  		System.out.println("");
			    	int model = sc.nextInt();
			    	
			    	switch(model){
			    		case 1:
			    			carDetails("Honda City",2016,"White","Diesel",750000,"All Papers Available With Company Service");
			    			dis();

			    			break;
			    		case 2:
			    			carDetails("Honda Civic",2014,"Silver","Diesel",1100000,"\n-All Papers Available With Company Service\n-Top end Model");			    			
			    		break;
			    		case 3:
			    			carDetails("Honda Amaze",2018,"Brown","Petrol",550000,"\n-All Papers Available With Company Service\n- Insurance Available");
			    			break;
			    		case 4:
			    			carDetails("Honda City 4th Generation",2019,"White","Diesel",700000,"\n-All Papers Available With Company Service\n-Top end Model\n-Fully Automatic\n-Insurance Available");
			    			break;
			    
			      }
			      break;
			      
			      case 2:
			      	System.out.println("");
			      	System.out.println("Choose Model");
			  			System.out.println("");
			  			System.out.println("1.Breeza" + "\n2.Swift" + "\n3.Zeta" + "\n4.Dzire");
			  			System.out.println("");
			  			int model2 = sc.nextInt();
			  		
			  			switch(model2){
			  				case 1 :
			  					carDetails("Suzuki Breeza",2016,"Metallic Grey","Petrol",600000,"\n-All Papers Available With Company Service\n-Top end Model\n-Insurance Available");
			  					break;
			  				case 2:
			  					carDetails("Suzuki Swift",2013,"Silver","Petrol",400000,"\n-All Papers Available With Company Service Record\n-Insurance Available");
			  					break;
			  				case 3:
			  					carDetails("Suzuki Zeta",2017,"Brown","Diesel",400000,"\n-All Papers Available With Company Service Record\n-Insurance Available");
			  					break;
			  				case 4:
			  					carDetails("Suzuki Dzire",2019,"Blue","Diesel",700000,"\n-All Papers Available With Company Service Record\n-Insurance Available");
			  		  }
			  		  break;
			      
			      case 3:
			      	System.out.println("");
			      	System.out.println("Choose Model");
			      	System.out.println("");
			      	System.out.println("1.Tigor");
			      	System.out.println("\nCheck Out Later For More Cars");
			      	System.out.println("");
			      	int model3 = sc.nextInt();
			      	if(model3==1){
			      		carDetails("Tata Tigor",2017,"Silver","Diesel",325000,"\n-All Papers Available With Company Service Record\n-Insurance Available\n-Non Automatic");
			      	}
			      	break;
			      	
			      case 4:
			      	System.out.println("");
			      	System.out.println("Choose Model to view Details");
			      	System.out.println("");
			      	System.out.println("1.Hundai Creta" + "\n2.Mahindra Morazzo" + "\n3.Hundai Verna" + "\n4.Skoda Octivia" + "\n5.Volkswagob Vento" + "\n6.Skoda Rapid");
			      	System.out.println("");
			      	int model4 = sc.nextInt();
			      	
			      	switch (model4){
			      		case 1:
			      			carDetails("Hundai Creta",2018,"White","Diesel",750000,"\n-All Papers Available With Company Service Record\n-Insurance Available\n-Fully Automatic");
			      	}
			      	break;
			      	
			  }	
			  break;
			
			case 2:
				System.out.println("suv2");
			  break;
			  
			case 3:
			  System.out.println("");
			  break;
			    
    }
    
    
    
    
    
    
    
    
	}
	
}
