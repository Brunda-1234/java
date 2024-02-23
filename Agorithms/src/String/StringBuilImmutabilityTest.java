
package String;

public class StringBuilImmutabilityTest {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Brunda");

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				sb.append("Hello");
				System.out.println(sb);

			}
		});

		Thread thread2 = new Thread(() -> {
			for (int j = 0; j < 10; j++) {
				sb.append("Cheeky");
				System.err.println(sb);

			}
		});

		try {

			thread1.join();
			thread2.join();
			thread1.start();
			thread2.start();
			thread1.wait(100000000);
			thread2.wait(100000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * Hello HelloCheeky HelloCheekyCheeky HelloCheekyCheekyCheeky
		 * HelloCheekyCheekyCheekyCheeky HelloCheekyCheekyCheekyCheekyCheeky
		 * HelloCheekyCheekyCheekyCheekyCheekyCheeky
		 * HelloCheekyCheekyCheekyCheekyCheekyCheekyHelloCheeky
		 * HelloCheekyCheekyCheekyCheekyCheekyCheekyHelloCheekyHelloCheeky
		 * HelloCheekyCheekyCheekyCheekyCheekyCheekyHelloCheekyHelloCheekyHelloCheeky
		 * HelloCheekyCheekyCheekyCheekyCheekyCheekyHello
		 * HelloCheekyCheekyCheekyCheekyCheekyCheekyHelloCheekyHelloCheeky
		 * HelloCheekyCheekyCheekyCheekyCheekyCheekyHelloCheekyHelloCheekyHello
		 * HelloCheekyCheekyCheekyCheekyCheekyCheekyHelloCheekyHelloCheekyHelloCheekyCheeky
		 */

//		StringBuffer sbuf = new StringBuffer();
//		
//		Thread thread3 = new Thread(()->{
//			for(int i=0;i<10;i++) {
//				sbuf.append("Hello");
//				System.err.println(sb);
//			}
//		});
//		
//		Thread thread4 = new Thread(()->{
//			for(int j=0;j<10;j++) {
//				sbuf.append("Cheeky");
//				System.err.println(sb);
//			}
//		});
//		
//		thread3.start();
//		thread4.start();
//		
//	}
	}
}
