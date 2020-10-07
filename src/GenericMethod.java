import java.util.Arrays;
import java.util.stream.Collectors;

public class GenericMethod {
	public static <T extends Comparable<T>> T getMaximum(T [] arrGeneric) {
		return Arrays.stream(arrGeneric).collect(Collectors.maxBy(T::compareTo)).get();
	}
}
