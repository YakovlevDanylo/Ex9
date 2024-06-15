
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] testString = {"A man, a plan, a canal: Panama","race a car"," "};
        System.out.println(isPalindrome(testString[2]));

        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 7)));
    }

    //Ex #1
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        if(str.equals(reversedStr.toString())) {
            return true;

        }
        return false;
    }

    //Ex #2
    public static boolean containsDuplicate(int[] nums) {
        Integer s = 5;
        Set<Integer> setNums = new HashSet<>();
        for(int num : nums) {
            if (!setNums.add(num)) {
                return true;
            }
        }
        return false;
    }

    //EX #3
    public static int[] twoSum(int[] nums, int target) {
        int arrSize = nums.length;
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}