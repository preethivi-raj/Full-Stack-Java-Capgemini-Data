package Stream;import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,3,54,53,43};
		
		Stream<int []> num = 
				  Arrays.stream(new int[][] {arr});
		
		num.flatMapToInt(Arrays::stream)
		   .filter(num1->num1%2 ==0)
		   .map(num2 -> num2*2)
		   .forEach(System.out ::println);
		
	}
	
	int [] data=  {1,213,23,2,32,3,23,43,43,4,34,34353,53,14};
	
	IntStream numberStream = Arrays.stream(data);
	
	
	Stream<String> strm = Stream.of("Java", "JS", "Python", "HTML");

//	strm.map(String::toString)   
//	    .forEach(System.out::println);

}
