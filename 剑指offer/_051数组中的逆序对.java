package 剑指offer;

public class _051数组中的逆序对 {
    public static int ans = 0;
    public static void merge(int[] nums,int left,int right){
        int mid = left+(right-left)/2;
        if (left<right){
            merge(nums,left,mid);
            merge(nums,mid+1,right);
            mergeSort(nums,left,mid,right);
        }
    }
    public static void mergeSort(int []nums,int left,int mid,int right){
        int i = left;
        int j = mid+1;
        int k = 0;
        int[] tempArr = new int[right-left+1];
        while(i<=mid && j <= right){
            if (nums[i]<=nums[j]){
                tempArr[k++] = nums[i++];
            }else{
                tempArr[k++] = nums[j++];
                ans++;
            }
        }
        while(i <= mid){
            tempArr[k++] = nums[i++];
        }
        while(j<=right){
            tempArr[k++] = nums[j++];
        }
        for (int l = left;l<=right;l++){
            nums[l] = tempArr[l];
        }
    }
    public int reversePairs(int[] nums) {
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,7,5,4,3,2};
        merge(nums,0,nums.length-1);
        for(int x:nums){
            System.out.println(x);
        }

    }
}
