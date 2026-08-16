class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        ArrayList<int[]>result=new ArrayList<>();
        int[]nt=intervals[0];
        result.add(nt);
        for(int[] k : intervals){
            if(k[0]<=nt[1]){
                nt[0]=Math.min(nt[0],k[0]);
                nt[1]=Math.max(nt[1],k[1]);
            }
            else{
                nt = k;
                result.add(nt);
            }

        }
        return result.toArray(new int[result.size()][]);
    }
}