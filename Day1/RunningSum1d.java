package Day1;

public class RunningSum1d {
    public int[] runningSum(int[] nums) {
        int [] results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            results[i] = 0;
            for (int j = 0; j <= i; j++) {
                results[i] += nums[j];
            }
        }
        return results;
    }

    public static void main(String[] args) {
        RunningSum1d sum1d = new RunningSum1d();
        int[]res = sum1d.runningSum(new int[]{1, 1, 1,1,1});
        for (int re : res) {
            System.out.println(re);
        }
    }
}
