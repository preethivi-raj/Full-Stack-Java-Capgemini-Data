package Demo;

import java.util.Arrays;
import java.util.List;



public class Test {    
	public static void main(String[] args) {     
		List<String> list = Arrays.asList("Java", "Lambda", "Streams");list.stream().map(String::toUpperCase).forEach(System.out::println);



		}
	}

