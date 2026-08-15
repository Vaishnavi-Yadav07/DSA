class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        for(int i =1;i<=nums.length;i++){
            set.add(i);
        }
        HashSet<Integer>numset= new HashSet<>();
        for(int j =0;j<nums.length;j++){
            numset.add(nums[j]);
        }
        for(int k : set){
            if(!numset.contains(k)){
                list.add(k);
            }
        }
        return list;

        
    }
}