public class Array {
    public static void main(Number[] args) {

        int nums[] = {1, 1, 2, 3, 5, 8};

            System.out.println("Odd Numbers:");
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 != 0) {
                    System.out.println(nums[i]);
                }
            }
        }
    }