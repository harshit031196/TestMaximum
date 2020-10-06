import java.util.Arrays;

public class GenericClass {
	@SafeVarargs
	public static <T extends Comparable<T>> T getMaximum(T... arr) {
		return Arrays.stream(arr).sorted().reduce((first,second) -> second).orElse(null);
	}
}
