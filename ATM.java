import java.io.IOException;
import java.util.Scanner;
class ATM extends Thread{
	private int accNo;
	private int balance;
	public Scanner sc = new  Scanner(System.in);

	void deposit(){
		System.out.println("Enter Amount : ");
		//balance+=balance;
		int amount = sc.nextInt();
		balance+=amount;
		System.out.println("\tYOUR AMOUNT HAS BEEN DEPOSITRD SUCCESFULLY!\n\n");
	}

	void withDraw(){
		System.out.println("Enter Amount : ");
		int wa = sc.nextInt();
		if(wa>balance){
			System.out.println("\n\tINSUFFICIENT BALANCE!\n");
		}else{
			balance-=wa;
			System.out.println("\n\tCollect your Amount...\n");
			try{
				Thread.sleep(4000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

	void checkBalance(){
		System.out.println("\n\tBALANCE : " + balance + "\n");
	}

	public static void main(String[] args) throws IOException,InterruptedException {
		Scanner sc = new  Scanner(System.in);
		ATM obj = new ATM();
		int response=0;
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();	
		while(response!=4){
			System.out.println("\n1.Deposit \n2.WithDraw \n3.Check Balance \n4.Exit");
			response = sc.nextInt();
			switch (response) {
				case 1:
					obj.deposit();
					break;
				case 2:
					obj.withDraw();
					break;
				case 3:
					obj.checkBalance();
					break;
			}
		}
	}	

}