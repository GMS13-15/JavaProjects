import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
class Bus{
	private int busNo;
	private boolean ac;
	private int capacity;

	Bus(int busNo,boolean ac, int capacity){
		this.busNo = busNo;
		this.ac = ac;
		this.capacity = capacity;
	}

	void setCapacity(int cap){	
		this.capacity = cap; 
	}

	void setAc(boolean a){
		this.ac = a;
	}

	void setBusNo(int bNo){
		this.busNo = bNo;
	}

	int getCapacity(){
		return capacity;
	}

	boolean getAc(){
		return ac;
	}

	int getBusNo(){
		return busNo;
	}

	void displayBusInfo(){
		System.out.println("Bus No : " + busNo + "\nAc : " + ac + "\nCapacity : " + capacity + "\n");
	}

}

class Booking{
	ArrayList<String> passengerName = new ArrayList<String>();
	String name;
	int busNo;
	Date date;
	int members=0;
	int capacity = 0;
	int booked=0;
	int route;
	int id=1;

	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Travelling Route : ");
		try{
			route = sc.nextInt();
		}catch(Exception e){
			System.out.println("Enter Correct Values !!!");
		}
		System.out.println("Enter No of Members : ");
		this.members = sc.nextInt();
		for(int i=1;i<=members;i++){
			System.out.println("Enter member " + i + " name : ");
			name = sc.next();
			passengerName.add(name);
		}
		System.out.println("Enter Bus No : ");
		busNo = sc.nextInt();
		System.out.println("Enter Date (dd-mm-yyyy) : ");
		String dateInput = sc.next();
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();	
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("\n\t\t---Booking Details---");
		System.out.println(	"\t\nPassenger Names and ID: \n");
		for(String n : passengerName){
			System.out.println("ID"+ id + " : " + n);
			++id;
		}

		System.out.println("\n Total Fare : " + ticketPrice(route) + "\n");
		System.out.println("Your Booking is Confirmed\n");


		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try{
			date = dateFormat.parse(dateInput);
		}catch(Exception e){
			e.printStackTrace();
		}	
	}

	boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
		int bookedSeat = booked+members;
		for(Bus bus:buses){
			if(bus.getBusNo()==busNo){
				capacity = bus.getCapacity();
			}
		}

		for(Booking book:bookings){
			if(book.busNo == busNo && book.date.equals(date)){
				booked = bookedSeat;
			}
		}
		//System.out.println(booked);
		return booked<capacity?true:false;
	}

	float ticketPrice(int routeNo){
		int price=0;
		//BusMain bm = new BusMain();
		switch (routeNo){
			case 1:
				price =  members*600;
				break;
			case 2:
				price = members*400;
				break;
			case 3:
				price = members*700;
				break;
			case 4:
				price = members*600;
				break;
			case 5:
				price = members*1050;
				break;
			case 6:
				price = members*300;
				break;
		}
		return price;
	}
}

public class BusMain { 
	
	void busRoutes(){
		ArrayList<String> routes = new ArrayList<String>();
		routes.add("\t1.Madurai - Chennai      \n\tBus No : 1  Fare : 600/-");
		routes.add("\n\t2.Madurai - Coimbatore \n\tBus No : 2  Fare : 400/-");
		routes.add("\n\t3.Madurai - Bangalore    \n\tBus No : 3  Fare : 700/-");
		routes.add("\n\t4.Madurai - Chennai      \n\tBus No : 4  Fare : 600/-");
		routes.add("\n\t5.Madurai - Hyderabad    \n\tBus No : 5  Fare : 1050/-");
		routes.add("\n\t6.Madurai - Trichy       \n\tBus No : 6  Fare : 300/-");
		for (String b : routes) {
			System.out.println(b);
		}
	}

	public static void main(String[] args) throws IOException,InterruptedException{
		ArrayList<Bus> bus = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		BusMain bm = new BusMain();
		int i=1;

		bus.add(new Bus(1, true, 1));
		bus.add(new Bus(2, true, 50));
		bus.add(new Bus(3, true, 45));
		bus.add(new Bus(4, true, 45));
		bus.add(new Bus(5, true, 45));
		bus.add(new Bus(6, true, 45));
		int response = 1;

		Scanner sc= new Scanner(System.in);
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();	
		System.out.println("------------BUS ROUTES------------");
		bm.busRoutes();
		while(response==1){
			System.out.println("\t\tChoose Your Option \n1.Booking \n2.Exit \n3.Booked Tickets \n4.Cancel Ticket" );
			try{
				response = sc.nextInt(); 
			}catch(Exception e){
				System.out.println("Enter Correct Values!!");
				break;
			}
			if(response==2 ){
				System.out.println("Thank You!!!");
				break;
			}
			if(response==3){
				try{
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();	
				}catch(Exception e){
					System.out.println(e);
				}
				for(Booking b: bookings){
					System.out.println("\nPassenger ID : " + (b.id-1));
					System.out.println("\tPassenger Names : \n" );
					for(String c : b.passengerName){
						System.out.println(i  + " - "+ c + " ");
						i++;
					}
					System.out.println("Route : " + b.route);
					System.out.println("Bus No : " + b.busNo);

				}
				break;
			}
			/*
			if(response==4){
				System.out.println("Enter passenger ID : ");
				int id = sc.nextInt();
				for(Booking b:bookings){
					b.remove(id)
				}
			}
			*/
			Booking booking = new Booking();
			//System.out.println(booking);
			if(booking.isAvailable(bookings,bus)){
				bookings.add(booking);
							}else{
				System.out.println("\nSorry! Bus is already full! Try Another Bus or date!");
			}      
		}		
	}
}