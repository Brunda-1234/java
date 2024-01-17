package com.te.basic.programs.threads;

class TheatreSeat {
	
	int total_seats = 10;
	
//	public void bookSeats(int seats){
//		
//		if(total_seats >= seats) {
//			System.out.println(seats+" Seats Booked Successfully");
//			total_seats = total_seats-seats;
//			System.out.println("Seats Left" + total_seats);
//		}else {
//			
//			System.out.println("Seats Cannot be Booked... ");
//			System.out.println("seats Left" + total_seats);
//		}
//		
//	}
	/*
	 * 7 Seats Booked Successfully
      6 Seats Booked Successfully
       Seats Left-3
      Seats Left3
	 */

	public  synchronized void  bookSeats(int seats){
		
		if(total_seats >= seats) {
			System.out.println(seats+" Seats Booked Successfully");
			total_seats = total_seats-seats;
			System.out.println("Seats Left  " + total_seats);
		}else {
			
			System.out.println("Seats Cannot be Booked... ");
			System.out.println("seats Left  " + total_seats);
		}
		
	}
	/*
	 * 7 Seats Booked Successfully
      Seats Left  3
      Seats Cannot be Booked... 
      seats Left  3
	 */
}
public class MovieBookApp extends Thread {
	static TheatreSeat theatreSeat;
	int seats;
	public void run() {
		
		theatreSeat.bookSeats(seats);
	}

	public static void main(String[] args) {
		
		theatreSeat = new TheatreSeat();
	
		MovieBookApp deepak = new MovieBookApp();
		deepak.seats = 7;
		deepak.start();
		
		MovieBookApp amit = new MovieBookApp();
		amit.seats = 6;
		amit.start();
	}
}

/*
 * Without Using synchronization Both deepak and amit threads will work concurrently
 * 
 * so im getting output like this: ==
 * 
 * Seats Booked Successfully
    Seats Left4
   Seats Booked Successfully
    Seats Left-3
 * 
 * */
