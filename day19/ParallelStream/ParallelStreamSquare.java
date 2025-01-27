package Day19.ParallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamSquare {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(29, 56, 84, 37, 59, 49, 53, 78, 66, 89, 70, 30, 49, 91);

        s.parallelStream().filter(n -> n > 50)
                .map(n -> n * n)
                .limit(10)
                .forEach(System.out::println);
    }
}
