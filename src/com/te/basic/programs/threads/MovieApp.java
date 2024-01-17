package com.te.basic.programs.threads;

class Threatre{
	
int total_seats = 10;
	
	public void bookSeats(int seats){
		
		if(total_seats >= seats) {
			System.out.println(seats+" Seats Booked Successfully");
			total_seats = total_seats-seats;
			System.out.println("Seats Left" + total_seats);
		}else {
			
			System.out.println("Seats Cannot be Booked... ");
			System.out.println("seats Left" + total_seats);
		}
		
	}
}
public class MovieApp extends Thread {
	
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
