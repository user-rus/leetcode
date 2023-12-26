package N1.TwoSum;

public class Sol_1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] t = null;
        boolean d = false;
        if (nums.length >= 4) {
            for (int i = 0; i < nums.length; i++) {
                if(d==true)break;
                for (int j = 0; j < nums.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if ((nums[i] + nums[j]) == target) {
                        t = new int[]{i, j};
                        d=true;
                    }

                }
            }
        } else if (nums.length < 4) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if ((nums[i] + nums[j]) == target) {
                        t = new int[]{i, j};
                        i = nums.length;
                    }

                }
            }
        }

        return t;
    }

    /*public static void main(String[] args) {
        int[] myArray = twoSum(new int[]{2,5,5,11}, 10);
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.print("]");
    }*/

}
