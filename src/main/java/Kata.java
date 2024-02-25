
public class Kata {
    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int mostBad = Integer.MAX_VALUE;
        int f = 0;
        if (nums.length > 3) {
            for (int i = 0; i < nums.length; i++) {
                if (Math.abs(target) - Math.abs(nums[i]) > target - mostBad)  {
                    mostBad = nums[i];
                    f = i;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == f) {
                continue;
            }
            sum += nums[i];
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        threeSumClosest(new int[] {1, 1, 1, 0}, 100);
    }
}
