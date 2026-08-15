class Solution {
    public List<Integer> findDuplicates(int[] nums) { 
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int k : map.keySet()){
            if(map.get(k)==2){
                list.add(k);
            }
        }
        
        return list;
        

        
    }
}