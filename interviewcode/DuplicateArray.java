import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class DuplicateArray {

    public static void main(String[] args) {
        int arr[] = {3,2,2,3,4,5,4,7,8,9,8,9,1};
        remove(arr);
    }
    private static void remove(int[] arr) {
        Set<Integer> set = Arrays.stream(arr).boxed().collect(toSet());
        System.out.println(set);

        List<Integer> collect = IntStream.rangeClosed(1, 9).filter(i -> !set.contains(i))
                .boxed().collect(toList());
        System.out.println(collect);
    }
}
