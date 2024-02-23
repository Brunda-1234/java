package vivrithi;

import java.util.HashMap;
import java.util.Map;

public class HashMapT extends Thread {
	
	static Map<Integer, String> map = new HashMap<Integer, String>();

	public void run() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		map.put(4, "Im here");

	}

	public static void main(String[] args) {

		map.put(1, "Hello");
		map.put(2, "Bruno");
		map.put(3, "Come");
		HashMapT thread = new HashMapT();
		thread.start();

	}

}
