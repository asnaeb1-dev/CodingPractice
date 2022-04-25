package Searching;

public class SearchUniqueElement {
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = nums.length;

        if(nums[0] != nums[1]) return nums[0];
        if(nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            //check if mid elment is the element
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid];

            //unfortunately mid isn't the unique element
            //look in other directions

            if(mid % 2 == 0 && nums[mid] == nums[mid + 1] ||
                    mid % 2 == 1 && nums[mid] == nums[mid - 1]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5, 5, 2, 3, 3, 1, 1, 6, 6};
        System.out.println(singleNonDuplicate(a));
    }
}
