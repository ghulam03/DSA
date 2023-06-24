package ProblemsKK.Arrays;

public class NoOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] sample={2,3,5,4,5,34,4,34};
//        int answer=numIdenticalPairs(sample);
        System.out.println(numIdenticalPairs(sample));

    }
}
