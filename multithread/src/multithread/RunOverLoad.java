package multithread;

public class RunOverLoad extends Thread{
	
	public void run() {
		System.out.println("Thread Started: ");
	}
	
	public void run(int a,int b) {
		int sum  =a+b;
		System.out.println(sum);


	}
	public static void main(String[] args) {
		
		RunOverLoad  runover = new RunOverLoad();
//		runover.run();
//		runover.run(10, 10);
		runover.start();
	}

}
