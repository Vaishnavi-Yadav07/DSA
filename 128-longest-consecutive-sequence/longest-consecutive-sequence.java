class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int[]arr = new int[set.size()];
        int i =0;
        for(int k :set){
            arr[i++]=k;
        }
        Arrays.sort(arr);
        if(arr.length==0)return 0;
        int count =1;
        int max =1;
        for(int j =0;j<arr.length-1;j++){
            if(arr[j+1]-arr[j]==1){
                count++;
                max=Math.max(count,max);
            }else{
                count =1;
            }
        }
        return max;
    }
}