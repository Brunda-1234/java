package CollectionPrectice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddLinkedLists {
	// here we need to add the two lists if we get the double digits we need to take the carry and return a list in single digits
	

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(4, 5, 3);
        List<Integer> list2 = Arrays.asList(6, 7, 2);
        List<Integer> res = new ArrayList<>();

        int carry = 0;

        for (int i = list1.size() - 1; i >= 0; i--) {
            int sum = list1.get(i) + list2.get(i) + carry;
            res.add(0, sum % 10);   
            /*
             * sum%10   ==  5
             *              2
             *              1
             */
            System.out.println(sum % 10);
            carry = sum / 10;
            /*
             * carry == 0
             *          1
             *          1
             */
            System.err.println(carry);
        }

        // If there's a carry left, add it to the result
        while (carry > 0) {
            res.add(0, carry % 10);
            carry /= 10;
        }

        System.out.println(res);
        //output: ==[1, 1, 2, 5]
    }
}

