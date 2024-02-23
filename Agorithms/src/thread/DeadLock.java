package thread;

class A {

	public synchronized void d1(B b) {

		System.out.println("Thread1 starts excecution of d1 method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Thread1 trying to call b's last method");
		b.last();

	}

	public synchronized void last() {
		System.out.println("Inside A last method");
	}
}

class B {

	public synchronized void d2(A a) {

		System.out.println("Thread1 starts excecution of d2 method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Thread1 trying to call A's last method");
		a.last();

	}

	public synchronized void last() {
		System.out.println("Inside B last method");
	}

}

public class DeadLock extends Thread {

	A a = new A();
	B b = new B();

	public void m1() {
		this.start(); // main Thread
		try {
			this.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.d1(b);
	}

	public void run() {
		b.d2(a); // Child Thread
	}

	public static void main(String[] args) {

		DeadLock t = new DeadLock();
		t.m1();
//		  t.start();
	}

}
