import java.util.Optional;

public class PossibleCombination {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 10; ) {
            System.out.println(i);
            i += 2;
        }
    }
}
