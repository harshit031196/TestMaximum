import java.util.Arrays;
import java.util.stream.Collectors;

public class GenericMethod {
	public static <T extends Comparable<T>> T getMaximum(T [] arr) {
		return Arrays.stream(arr).collect(Collectors.maxBy(T::compareTo)).get();
	}
}
