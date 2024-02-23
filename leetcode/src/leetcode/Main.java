package leetcode;

class Base {

    public void show() {
        System.out.println("Base class show() method called");
    }

}

class Derived extends Base {

    public void show() {
        System.out.println("Derived class show() method called");
    }

}

public class Main {

    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }

}
/*Derived class show() method called
In the above example, b is reference of Base type and refer to an object of Derived class. 
 In java, functions are virtual by default. So the run time polymorphism happens and derived fun() is called.
 * 
 */
