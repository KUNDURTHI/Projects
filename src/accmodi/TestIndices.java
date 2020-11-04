package accmodi;
//package accmodi.Ikm.Indices;
import java.util.stream.Stream;

public class TestIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(new Indices("Mercury"), new Indices("Venues"), new Indices("Earth")).flatMap(i -> i.indices.stream()).mapToInt(j -> j).max().ifPresent(s -> System.out.println(s));
	}


}
