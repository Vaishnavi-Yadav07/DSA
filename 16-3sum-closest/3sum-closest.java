class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i =0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }else if(sum<target){
                    map.put(sum,Math.abs(target-sum));
                    left++;
                }else{
                    map.put(sum,Math.abs(target-sum));
                    right--;
                }
            }
        }
        int min = Collections.min(map.values());
        for(int k : map.keySet()){
            if(map.get(k)==min){
                return k;
            }
        }
        return -1;
        
    }
}