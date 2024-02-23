package optional;

import java.util.Optional;

public class OPTest {
	
	public static void main(String[] args) {
		

        String s = "Cristiano Ronaldo";
        String s1 = "null";
        
        Optional<String> of = Optional.of(s1);
        System.out.println(of);
        
        Optional<String> ofNullable = Optional.ofNullable(s1);
        System.out.println(ofNullable);
	}

}
