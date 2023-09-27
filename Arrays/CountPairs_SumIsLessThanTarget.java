class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i=0;i<nums.size();i++){
            int sum = nums.get(i);
            for(int j=i+1;j<nums.size();j++){
                if(sum+nums.get(j) < target){
                    count++;
                }
            }
        }

        return count;
    }
}
